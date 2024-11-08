package com.netctoss_springboot.service;

import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Cost;

/**
* 针对于Cost资费模块，编写业务层的代码，设计成接口，扩展性强
*/
public interface CostService {
    Cost findByCostId(Integer costId);

    PageInfo findByPage(int pageNum);

    boolean updateCost(Cost cost);

    boolean deleteCost(Integer costId);

    boolean changeStatus(Integer costId);

    void addCost(Cost cost);

}
