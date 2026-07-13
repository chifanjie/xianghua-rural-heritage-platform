package com.example.rrmplatform.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.rrmplatform.common.Constants;
import com.example.rrmplatform.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rrmplatform.mapper.UserMapper;
import com.example.rrmplatform.pojo.User;
import com.example.rrmplatform.service.UserService;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean saveUser(User user) {
        return saveOrUpdate(user);
    }
    @Override
    public User queryUser(String userName) {
        return userMapper.queryUser(userName);
    }

    @Override
    public int queryUserRole(String userName) {
        return userMapper.queryUserRole(userName);
    }

    @Override
    public List<Map<String, Object>> getUserPower(String userName) {
        return userMapper.getUserPower(userName);
    }

    @Override
    public User RegisterAdminUser(User user) {
        User user1 = userMapper.queryUser(user.getUsername());
        if (user1 != null) {
            throw new ServiceException(Constants.CODE_500, "此账号名字已被使用过,请更换");
        } else {
            user.setRole_id(100);

            userMapper.saveUser(user);

            return user;
        }
    }

    @Override
    public User RegisterClientUser(User user) {
        User user1 = userMapper.queryUser(user.getUsername());
        if (user1 != null) {
            throw new ServiceException(Constants.CODE_500, "此账号名字已被使用过,请更换");
        } else {
            user.setRole_id(200);

            userMapper.saveUser(user);

            return user;
        }
    }

    @Override
    public List<User> listUser() {
        return super.list();
    }

    @Override
    public boolean removeUserById(int id) {
        return super.removeById(id);
    }

    @Override
    public IPage<User> findPage(Integer pageNum, Integer pageSize, String username) {
        IPage<User> page = new Page<>(pageNum, pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username", username);
        return super.page(page, queryWrapper);
    }
}
