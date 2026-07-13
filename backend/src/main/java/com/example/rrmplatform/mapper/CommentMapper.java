package com.example.rrmplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rrmplatform.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
    List<Comment> getByBusinessId(Integer business_id);
}
