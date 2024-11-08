package com.netctoss_springboot.controller;



import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Admin;
import com.netctoss_springboot.pojo.SearchCondition;
import com.netctoss_springboot.service.AdminService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("findByPage")
    public String  findByPageAndCondition(SearchCondition condition, Integer pageNum, Model model){
        if(StringUtils.isEmpty(pageNum)){
            pageNum = 1;
        }
        PageInfo pageInfo = adminService.findByPageAndCondition(condition,pageNum);
        System.out.println(condition);
        model.addAttribute("condition",condition);
        model.addAttribute("pageInfo",pageInfo);
        return "admin/admin_list";
    }

    @RequestMapping("deleteAdmin")
    public ModelAndView deleteAdmin(Integer adminId,int page,ModelAndView mav){
        adminService.deleteAdmin(adminId);
        mav.setViewName("redirect:/admin/findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("toUpdate")
    public ModelAndView toUpdate(Integer adminId,int page,ModelAndView mav){
        Admin admin = adminService.findByAdminId(adminId);
        mav.setViewName("admin/admin_modi");
        mav.addObject("admin",admin);
        mav.addObject("page",page);
        return mav;
    }

    @RequestMapping("updateAdmin")
    public ModelAndView updateAdmin(Admin admin,int page,ModelAndView mav){
        adminService.updateAdmin(admin);
        mav.setViewName("redirect:/admin/findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("toAdd")
    public ModelAndView toAdd(ModelAndView mav){
        Admin admin = new Admin();
        mav.addObject("admin",admin);
        mav.setViewName("admin/admin_add");
        return mav;
    }

    @RequestMapping("addAdmin")
    public ModelAndView addAdmin(Admin admin,int page,ModelAndView mav){
        adminService.addAdmin(admin);
        mav.setViewName("redirect:/admin/findByPage?pageNum="+page);
        return mav;
    }






}
