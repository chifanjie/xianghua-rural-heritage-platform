package com.example.rrmplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.rrmplatform.mapper.CommentMapper;
import com.example.rrmplatform.pojo.Comment;
import com.example.rrmplatform.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public boolean saveComment(Comment comment) {
        return saveOrUpdate(comment);
    }


}
