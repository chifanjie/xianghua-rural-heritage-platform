package com.example.rrmplatform.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.rrmplatform.common.Constants;
import com.example.rrmplatform.exception.ServiceException;
import com.example.rrmplatform.pojo.User;
import com.example.rrmplatform.service.UserService;

import java.util.List;
import java.util.Map;


public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录用户名
        String userName = (String) principalCollection.getPrimaryPrincipal();
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        List<Map<String, Object>> powerList = userService.getUserPower(userName);

        for (Map<String, Object> powerMap : powerList) {
            //添加角色
            simpleAuthorizationInfo.addRole(String.valueOf(powerMap.get("roleName")));
            //添加权限
            simpleAuthorizationInfo.addStringPermission(String.valueOf(powerMap.get("perName")));
        }
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        //获取用户信息
        String userName = authenticationToken.getPrincipal().toString();
        //根据用户名去数据库查询用户信息
        User sysUser = userService.queryUser(userName);
        if (sysUser == null) {
            //这里返回后会报出对应异常
            throw new ServiceException(Constants.CODE_300, "无此用户!");
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息

            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userName, sysUser.getPassword_hash(), getName());
            return simpleAuthenticationInfo;
        }
    }
}
