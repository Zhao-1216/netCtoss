package com.netctoss_springboot.mapper;



import com.netctoss_springboot.pojo.Account;
import com.netctoss_springboot.pojo.SearchCondition;
import com.netctoss_springboot.pojo.Service;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ServiceMapper {
    Service findByServiceId(Integer serviceId);


    List<Service> findAll(SearchCondition condition);

    boolean deleteService(Integer serviceId);

    boolean changeStatus(Integer serviceId);

    boolean updateService(Service service);

    void addService(Service service);

    Account findByIdCardNo(String idCardNo);
}
