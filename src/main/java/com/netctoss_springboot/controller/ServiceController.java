package com.netctoss_springboot.controller;



import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Account;
import com.netctoss_springboot.pojo.SearchCondition;
import com.netctoss_springboot.pojo.Service;
import com.netctoss_springboot.service.ServiceService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("service")
public class ServiceController {
    @Resource
    private ServiceService serviceService;

    @RequestMapping("findByServiceId")
    public ModelAndView findByServiceId(Integer serviceId,ModelAndView mav){
        Service service = serviceService.findByServiceId(serviceId);
        mav.setViewName("service/service_detail");
        mav.addObject("service",service);
        return mav;
    }

    @RequestMapping("findByPage")
    public String findByPageAndCondition(SearchCondition condition, Integer pageNum, Model mav){
        System.out.println(condition);
        if(StringUtils.isEmpty(pageNum)){
            pageNum = 1;
        }
        PageInfo pageInfo =serviceService.findByPageAndCondition(condition,pageNum);
        mav.addAttribute("condition",condition);
        mav.addAttribute("pageInfo",pageInfo);
        return "service/service_list";
    }

    @RequestMapping("deleteService")
    public ModelAndView deleteService(Integer serviceId,int page,ModelAndView mav){
        serviceService.deleteService(serviceId);
        mav.setViewName("redirect:/service/findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("changeStatus")
    public ModelAndView changeStatus(Integer serviceId,int page,ModelAndView mav){
        serviceService.changeStatus(serviceId);
        mav.setViewName("redirect:/service/findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("toUpdate")
    public ModelAndView toUpdate(Integer serviceId,int page,ModelAndView mav){
        Service service = serviceService.findByServiceId(serviceId);
        mav.setViewName("service/service_modi");
        mav.addObject("service",service);
        mav.addObject("page",page);
        return mav;
    }

    @RequestMapping("updateService")
    public ModelAndView updateService(Service service, int page,ModelAndView mav){
        serviceService.updateService(service);
        mav.setViewName("redirect:/service/findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("toAdd")
    public ModelAndView toAdd(ModelAndView mav){
        Service service = new Service();
        mav.setViewName("service/service_add");
        mav.addObject("service",service);
        return mav;
    }

    @RequestMapping("addService")
    public ModelAndView addService(Service service,ModelAndView mav){
        serviceService.addService(service);
        mav.setViewName("redirect:/service/findByPage");
        return mav;
    }


    @RequestMapping("findByIdCardNo")
    public ModelAndView findByIdCardNo(String idCardNo,ModelAndView mav){
        Account account = serviceService.findByIdCardNo(idCardNo);
        mav.setViewName("service/service_add");
        mav.addObject("account",account);
        return mav;
    }




}
