package com.example.rrmplatform.mapper;

import com.example.rrmplatform.pojo.Link;
import com.github.jeffreyning.mybatisplus.base.MppBaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LinkMapper extends MppBaseMapper<Link> {
    Link selectByLId(int id);
    List<Link> selectByGId(int gId);
}
