package com.netctoss_springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.netctoss_springboot.mapper.CostMapper;
import com.netctoss_springboot.pojo.Cost;
import com.netctoss_springboot.service.CostService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * 业务层的实现类，应该调用DAO层的代码
 */
@Component
public class CostServiceImpl implements CostService {
    /* 因为IOC容器已经开启了mapper/dao接口的扫描功能，意味着接口已经被扫描成bean对象了
    *  因此就可以使用注解自动装配了
    * */
    @Resource
    private CostMapper costMapper;
    private int pageSize=5;
    private int navigatePages=5;

    @Override
    public Cost findByCostId(Integer costId) {
        return costMapper.findByCostId(costId);
    }

    @Override
    public PageInfo findByPage(int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Cost> costs=costMapper.findAll();
        PageInfo pageInfo=new PageInfo(costs,navigatePages);
        return pageInfo;
    }


    @Override
    public boolean updateCost(Cost cost) {
        return costMapper.updateCost(cost);
    }


    @Override
    public boolean deleteCost(Integer costId) {
        return costMapper.deleteCost(costId);
    }

    @Override
    public boolean changeStatus(Integer costId) {
        return costMapper.changeStatus(costId);
    }

    @Override
    public void addCost(Cost cost) {
        costMapper.addCost(cost);
    }


}
