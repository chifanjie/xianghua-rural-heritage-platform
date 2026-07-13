package com.example.rrmplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rrmplatform.pojo.Heritage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HeritageMapper extends BaseMapper<Heritage> {
    Heritage selectByHName(String name);
}
