package com.example.rrmplatform.mapper;

import com.example.rrmplatform.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User queryUser(String userName );
    int queryUserRole(String userName);

    String queryPassword(String userName);

    @MapKey("userName")
    List<Map<String, Object>> getUserPower(String userName);

    int saveUser(User user);



}
