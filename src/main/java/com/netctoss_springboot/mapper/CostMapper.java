package com.netctoss_springboot.mapper;



import com.netctoss_springboot.pojo.Cost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CostMapper {
    Cost findByCostId(Integer costId);

    //可以使用mybatis的分页插件
    List<Cost> findAll();

    //修改资费到数据库
    boolean updateCost(Cost cost);

    //删除资费 实际上是修改资费的状态，改为2
    boolean deleteCost(Integer costId);

    //修改资费的状态， 暂停-->启用， 启用-->暂停
    boolean changeStatus(Integer costId);

    //添加一个新的资费套餐
    void addCost(Cost cost);

    //

}
