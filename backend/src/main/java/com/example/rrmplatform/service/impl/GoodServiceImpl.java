package com.example.rrmplatform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rrmplatform.mapper.GoodMapper;
import com.example.rrmplatform.pojo.Good;
import com.example.rrmplatform.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    GoodMapper goodMapper;

    @Override
    public Good getGoodByGId(int gId) {
        return goodMapper.selectById(gId);
    }

    @Override
    public Good getGoodByGName(String gName) {
        return goodMapper.selectByGName(gName);
    }

    @Override
    public int addGood(String name, String dis, String spec, String addr) {
        Good good = new Good(name, dis, spec, addr);
        return goodMapper.insert(good);
    }

    @Override
    public int deleteGoodByGId(int gId) {
        return goodMapper.deleteById(gId);
    }

    @Override
    public List<Good> getAllGoods() {
        return goodMapper.selectList(null);
    }

    @Override
    public int updateGood(int id, String name, String dis, String spec, String addr) {
        Good good = goodMapper.selectById(id);
        good.setGName(name);
        good.setGDisc(dis);
        good.setGSpec(spec);
        good.setGAddress(addr);
        return goodMapper.updateById(good);
    }

    @Override
    public List<Good> listGoodsByGAddress(String addr) {
        QueryWrapper<Good> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("GAddress", addr);
        return goodMapper.selectList(queryWrapper);
    }

    @Override
    public List<Good> listGoodsByPage(int pageNum, int pageSize) {
        Page<Good> page = new Page<>(pageNum, pageSize);
        Page<Good> goodPage = goodMapper.selectPage(page, null);
        return goodPage.getRecords();
    }

    @Override
    public List<Good> listGoodsByPageWithAddr(int pageNum, int pageSize, String addr) {
        Page<Good> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Good> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("GAddress", addr);
        Page<Good> goodPage = goodMapper.selectPage(page, queryWrapper);
        return goodPage.getRecords();
    }

    @Override
    public Page<Good> getPage(int pageNum, int pageSize) {
        Page<Good> page = new Page<>(pageNum, pageSize);
        return goodMapper.selectPage(page, null);
    }

    @Override
    public Page<Good> getPageByAddr(int pageNum, int pageSize, String addr) {
        Page<Good> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Good> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("GAddress", addr);
        return goodMapper.selectPage(page, queryWrapper);
    }


}
