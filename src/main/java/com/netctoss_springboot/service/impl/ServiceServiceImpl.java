package com.netctoss_springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.netctoss_springboot.mapper.ServiceMapper;
import com.netctoss_springboot.pojo.Account;
import com.netctoss_springboot.pojo.SearchCondition;
import com.netctoss_springboot.pojo.Service;
import com.netctoss_springboot.service.ServiceService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceServiceImpl implements ServiceService {
    @Resource
    private ServiceMapper serviceMapper;
    private int pageSize=5;
    private int navigatePages=5;


    @Override
    public Service findByServiceId(Integer serviceId) {
        return serviceMapper.findByServiceId(serviceId);
    }

    @Override
    public PageInfo findByPageAndCondition(SearchCondition condition, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Service> services = serviceMapper.findAll(condition);
        PageInfo pageInfo=new PageInfo(services,navigatePages);
        return pageInfo;
    }

    @Override
    public boolean deleteService(Integer serviceId) {
        return serviceMapper.deleteService(serviceId);
    }

    @Override
    public boolean changeStatus(Integer serviceId) {
        return serviceMapper.changeStatus(serviceId);
    }

    @Override
    public boolean updateService(Service service) {
        return serviceMapper.updateService(service);
    }

    @Override
    public void addService(Service service) {
        serviceMapper.addService(service);
    }

    @Override
    public Account findByIdCardNo(String idCardNo) {
        return serviceMapper.findByIdCardNo(idCardNo);
    }


}
