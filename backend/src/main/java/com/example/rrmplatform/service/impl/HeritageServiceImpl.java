package com.example.rrmplatform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rrmplatform.mapper.HeritageMapper;
import com.example.rrmplatform.pojo.Heritage;
import com.example.rrmplatform.service.HeritageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeritageServiceImpl implements HeritageService {
    @Autowired
    HeritageMapper heritageMapper;

    @Override
    public int addHeritage(String name, String his, String addr) {
        Heritage heritage = new Heritage(name, his, addr);
        return heritageMapper.insert(heritage);
    }

    @Override
    public List<Heritage> getAllHeritages() {
        return heritageMapper.selectList(null);
    }

    @Override
    public int deleteHeritage(int hId) {
        return heritageMapper.deleteById(hId);
    }

    @Override
    public Heritage getHeritageByHId(int hId) {
        return heritageMapper.selectById(hId);
    }

    @Override
    public Heritage getHeritageByHName(String hName) {
        return heritageMapper.selectByHName(hName);
    }

    @Override
    public int updateHeritage(int id, String name, String history, String address) {
        Heritage heritage = heritageMapper.selectById(id);
        heritage.setHName(name);
        heritage.setHHistory(history);
        heritage.setHAddress(address);
        return heritageMapper.updateById(heritage);
    }

    @Override
    public List<Heritage> listHeritagesByHAddress(String address) {
        QueryWrapper<Heritage> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("HAddress", address);
        return heritageMapper.selectList(queryWrapper);
    }

    @Override
    public List<Heritage> listHeritagesByPage(int pageNum, int pageSize) {
        Page<Heritage> page = new Page<>(pageNum, pageSize);
        Page<Heritage> heritagePage = heritageMapper.selectPage(page, null);
        return heritagePage.getRecords();
    }

    @Override
    public List<Heritage> listHeritagesByPageWithAddr(int pageNum, int pageSize, String addr) {
        Page<Heritage> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Heritage> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("HAddress", addr);
        Page<Heritage> heritagePage = heritageMapper.selectPage(page, queryWrapper);
        return heritagePage.getRecords();
    }

    @Override
    public Page<Heritage> getPage(int pageNum, int pageSize) {
        Page<Heritage> page = new Page<>(pageNum, pageSize);
        return heritageMapper.selectPage(page, null);
    }

    @Override
    public Page<Heritage> getPageByAddr(int pageNum, int pageSize, String addr) {
        Page<Heritage> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Heritage> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("HAddress", addr);
        return heritageMapper.selectPage(page, queryWrapper);
    }


}
