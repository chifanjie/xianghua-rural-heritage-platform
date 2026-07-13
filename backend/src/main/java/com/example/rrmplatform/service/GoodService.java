package com.example.rrmplatform.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rrmplatform.pojo.Good;
import com.example.rrmplatform.pojo.Heritage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodService {
    Good getGoodByGId(int gId);
    Good getGoodByGName(String gName);
    int addGood(String name, String dis, String spec, String addr);
    int deleteGoodByGId(int gId);
    List<Good> getAllGoods();
    int updateGood(int id, String name, String dis, String spec, String addr);
    List<Good> listGoodsByGAddress(String addr);
    List<Good> listGoodsByPage(int pageNum, int pageSize);
    List<Good> listGoodsByPageWithAddr(int pageNum, int pageSize, String addr);
    Page<Good> getPage(int pageNum, int pageSize);
    Page<Good> getPageByAddr(int pageNum, int pageSize, String addr);


}
