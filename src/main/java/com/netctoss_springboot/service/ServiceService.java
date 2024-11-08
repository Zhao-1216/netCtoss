package com.netctoss_springboot.service;
import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Account;
import com.netctoss_springboot.pojo.SearchCondition;
import com.netctoss_springboot.pojo.Service;


public interface ServiceService {

    Service findByServiceId(Integer serviceId);

    PageInfo findByPageAndCondition(SearchCondition condition, Integer pageNum);

    boolean deleteService(Integer serviceId);

    boolean changeStatus(Integer serviceId);

    boolean updateService(Service service);

    void addService(Service service);

    Account findByIdCardNo(String idCardNo);
}
