package com.netctoss_springboot.controller;



import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Cost;
import com.netctoss_springboot.service.CostService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * 编写Cost资费模块的控制器角色， 调用业务层的增删改查等方法
 */
@Controller
@RequestMapping("fee")
public class CostController {
    /* 因为业务层的实现类，已经被扫描成bean，因此此处可以自动装配*/
    @Resource
    private CostService costService;


    /*http://localhost:8088/netctoss/fee/findById?costId=1 */
    @RequestMapping("findById")
    public ModelAndView findByCostId(Integer costId, ModelAndView mav){
        Cost cost = costService.findByCostId(costId);
        mav.setViewName("fee/fee_detail");
        mav.addObject("cost",cost);
        return mav;
    }
    @RequestMapping("findByPage")
    public ModelAndView findByPage(Integer pageNum,ModelAndView mav){
        if(StringUtils.isEmpty(pageNum)){
            pageNum = 1;
        }
        PageInfo pageInfo = costService.findByPage(pageNum);
        mav.setViewName("/fee/fee_list");
        mav.addObject("pageInfo",pageInfo);
        return mav;
    }


    @RequestMapping("toUpdate")
    public ModelAndView toUpdateCost(Integer costId,int page,ModelAndView mav){
        Cost cost = costService.findByCostId(costId);
        mav.setViewName("/fee/fee_modi");
        mav.addObject("cost",cost);
        mav.addObject("page",page);
        return mav;
    }
    @RequestMapping("updateCost")
    public ModelAndView updateCost(Cost cost, int page,ModelAndView mav){
        costService.updateCost(cost);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("deleteCost")
    public ModelAndView deleteCost(Integer costId,int page,ModelAndView mav){
        costService.deleteCost(costId);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("changeStatus")
    public ModelAndView changeStatus(Integer costId,int page,ModelAndView mav){
        costService.changeStatus(costId);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("toAdd")
    public ModelAndView toAdd(ModelAndView mav){
        Cost cost = new Cost();
        mav.setViewName("fee/fee_add");
        mav.addObject("cost",cost);
        return mav;
    }

    @RequestMapping("addCost")
    public ModelAndView addCost(Cost cost,ModelAndView mav){
        costService.addCost(cost);
        mav.setViewName("redirect:findByPage");
        return mav;
    }



    @RequestMapping("testVue")
    @ResponseBody
    public String testVueAjax(String name,Integer age,Boolean flag){
        System.out.println(name+","+age+","+flag);
        return "success";
    }



}
