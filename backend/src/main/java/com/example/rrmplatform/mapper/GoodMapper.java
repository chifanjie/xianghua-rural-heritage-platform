package com.example.rrmplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rrmplatform.pojo.Good;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodMapper extends BaseMapper<Good> {
    Good selectByGName(String name);
}
