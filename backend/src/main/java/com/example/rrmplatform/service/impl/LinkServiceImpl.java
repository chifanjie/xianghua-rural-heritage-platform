package com.example.rrmplatform.service.impl;

import com.example.rrmplatform.mapper.GoodMapper;
import com.example.rrmplatform.mapper.LinkMapper;
import com.example.rrmplatform.pojo.Good;
import com.example.rrmplatform.pojo.Link;
import com.example.rrmplatform.service.LinkService;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl extends MppServiceImpl<LinkMapper, Link> implements LinkService {
    @Autowired
    LinkMapper linkMapper;
    @Autowired
    GoodMapper goodMapper;

    @Override
    public int addLink(int lId, int gId, String name, String info, String link, int score) {
        Link newLink = new Link(lId, gId, name, info, link, score);
        return linkMapper.insert(newLink);
    }

    @Override
    public List<Link> listLinks() {
        return linkMapper.selectList(null);
    }

    @Override
    public int deleteLink(int lId, int gId) {
        Link pk_link = new Link();
        pk_link.setLId(lId);
        pk_link.setGId(gId);
        return linkMapper.deleteByMultiId(pk_link);
    }

    @Override
    public int updateLink(int lId, int gId, String name, String info, String link, int score) {
        Link pk_link = new Link();
        pk_link.setLId(lId);
        pk_link.setGId(gId);
        Link newLink = linkMapper.selectByMultiId(pk_link);
        newLink.setLName(name);
        newLink.setLInfo(info);
        newLink.setLink(link);
        newLink.setLScore(score);
        return linkMapper.updateByMultiId(newLink);
    }

    @Override
    public Link getLinkByLId(int id) {
        return linkMapper.selectByLId(id);
    }

    @Override
    public List<Link> getLinksByGName(String name) {
        Good good = goodMapper.selectByGName(name);
        int gId = good.getGId();
        return linkMapper.selectByGId(gId);
    }
}
