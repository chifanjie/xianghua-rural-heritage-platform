package com.example.rrmplatform.service;

import com.example.rrmplatform.pojo.Link;
import com.github.jeffreyning.mybatisplus.service.IMppService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LinkService extends IMppService<Link> {
    int addLink(int lId, int gId, String name, String info, String link, int score);
    List<Link> listLinks();
    int deleteLink(int lId, int gId);
    int updateLink(int lId, int gId, String name, String info, String link, int score);
    Link getLinkByLId(int id);
    List<Link> getLinksByGName(String name);


}
