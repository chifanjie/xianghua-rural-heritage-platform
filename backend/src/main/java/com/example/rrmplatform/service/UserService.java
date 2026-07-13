package com.example.rrmplatform.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.rrmplatform.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    boolean saveUser(User user);

    User queryUser(String userName);

    int queryUserRole(String userName);

    List<Map<String, Object>> getUserPower(String userName);

    User RegisterAdminUser(User user);

    User RegisterClientUser(User user);

    List<User> listUser();

    boolean removeUserById(int id);

    IPage<User> findPage(Integer pageNum, Integer pageSize, String username);


}

