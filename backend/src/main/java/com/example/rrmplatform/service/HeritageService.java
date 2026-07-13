package com.example.rrmplatform.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rrmplatform.pojo.Good;
import com.example.rrmplatform.pojo.Heritage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HeritageService {
    int addHeritage(String name, String his, String addr);
    List<Heritage> getAllHeritages();
    int deleteHeritage(int hId);
    Heritage getHeritageByHId(int hId);
    Heritage getHeritageByHName(String hName);
    int updateHeritage(int id, String name, String history, String address);
    List<Heritage> listHeritagesByHAddress(String address);
    List<Heritage> listHeritagesByPage(int pageNum, int pageSize);
    List<Heritage> listHeritagesByPageWithAddr(int pageNum, int pageSize, String addr);
    Page<Heritage> getPage(int pageNum, int pageSize);
    Page<Heritage> getPageByAddr(int pageNum, int pageSize, String addr);
}
