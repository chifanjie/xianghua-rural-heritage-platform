package com.example.rrmplatform.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.rrmplatform.common.Constants;
import com.example.rrmplatform.common.Result;
import com.example.rrmplatform.exception.ServiceException;
import com.example.rrmplatform.pojo.User;
import com.example.rrmplatform.mapper.UserMapper;
import com.example.rrmplatform.service.UserService;
import com.example.rrmplatform.utils.SHA256;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cn.hutool.core.util.StrUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.rrmplatform.common.Constants.CODE_100;
import static com.example.rrmplatform.utils.saltUtil.getSalt;


@CrossOrigin
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;


    @GetMapping("/user/list")
    public List<User> findAll() {
        return userService.listUser();
    }

    @DeleteMapping("/{userId}")
    public boolean deleteUser(@PathVariable Integer userId) {

        return userService.removeUserById(userId);
    }

    @PostMapping("/loginUser")
    @ResponseBody
    public Result login(@RequestBody Map<String, String> params) {
        //添加用户认证信息
        String username = params.get("username");
        String password = params.get("password");
        User user = userMapper.queryUser(username);
        Subject subject = SecurityUtils.getSubject();

        //密码加密方式 MD5
        if (user != null) {
            String sha256Str = SHA256.getSHA256Str(password + user.getSalt());
            String password_hash = user.getPassword_hash();
            if (password_hash.equals(sha256Str)) {
                UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUsername(), sha256Str);
                try {
                    subject.login(usernamePasswordToken);
                } catch (AuthenticationException e) {
                    e.printStackTrace();
                    throw new ServiceException(Constants.CODE_600, "认证有误!");

                } catch (AuthorizationException e) {
                    e.printStackTrace();
                    throw new ServiceException(Constants.CODE_300, "授权异常!");
                }

                Session session = subject.getSession();
                session.setAttribute("user", user);
                return Result.success(user);
            }//用户存在且密码正确
            else {
                throw new ServiceException(Constants.CODE_600, "密码有误!");
//
            }
        } else {
            throw new ServiceException(Constants.CODE_600, "用户不存在!");
        }
    }

    @ResponseBody
    @PostMapping("/RegisterClientUser")
    public Result RegisterClientUser(@RequestBody Map<String, String> params) {

        String username = params.get("username");
        String password = params.get("password");


        if (StrUtil.isBlank(username) || StrUtil.isBlank(password))
            throw new ServiceException(Constants.CODE_400, "账号密码不能为空!");
        //md5加密后存进数据库中
        User user = new User();
        user.setUsername(username);
        String salt = getSalt(6);
        user.setSalt(salt);
        String sha256Str = SHA256.getSHA256Str(password + user.getSalt());
        user.setPassword_hash(sha256Str);

        return Result.success(userService.RegisterClientUser(user));
    }

    @ResponseBody
    @PostMapping("/RegisterAdminUser")
    public Result RegisterAdminUser(@RequestBody Map<String, String> params) {
        String username = params.get("username");
        String password = params.get("password");

        if (StrUtil.isBlank(username) || StrUtil.isBlank(password))
            throw new ServiceException(Constants.CODE_400, "账号密码不能为空!");
        //md5加密后存进数据库中
        User user = new User();
        user.setUsername(username);
        String salt = getSalt(7);
        user.setSalt(salt);
        String sha256Str = SHA256.getSHA256Str(password + user.getSalt());
        user.setPassword_hash(sha256Str);
        return Result.success(userService.RegisterAdminUser(user));
    }

    @RequestMapping(value = "/unauth")
    @ResponseBody
    public Object unauth() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", CODE_100);
        map.put("msg", "未登录");
        return map;
    }

    @GetMapping("/logoutUser")
    public boolean logoutUser() throws JsonProcessingException {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return true;
    }

    @GetMapping("/page")
    public IPage<User> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize, @RequestParam String username) {
        return userService.findPage(pageNum, pageSize, username);
    }
}
