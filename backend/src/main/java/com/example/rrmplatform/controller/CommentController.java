package com.example.rrmplatform.controller;

import com.example.rrmplatform.mapper.CommentMapper;
import com.example.rrmplatform.pojo.Comment;
import com.example.rrmplatform.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @Autowired
    CommentMapper commentMapper;

    @PostMapping
    public void save(@RequestBody Comment comment) {
        commentService.saveComment(comment);
    }

    @GetMapping
    public Map<String, Object> list(@RequestParam Integer business_id) {
        Map<String, Object> map = new HashMap<>();
        List<Comment> comments = commentMapper.getByBusinessId(business_id);

        map.put("rate", BigDecimal.ZERO);
        List<Comment> commentList = comments.stream().filter(comment -> comment.getRate() != null).collect(Collectors.toList());
        commentList.stream().map(Comment::getRate).reduce(BigDecimal::add).ifPresent(res -> {
            map.put("rate", res.divide(BigDecimal.valueOf(commentList.size()), 1, RoundingMode.HALF_UP));
        });
        return map;
    }
}
