package com.netctoss_springboot.mapper;


import com.netctoss_springboot.pojo.Privilege;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PrivilegeMapper {
    List<Privilege> findBySecondStep(Integer roleId);
}
