package com.netctoss_springboot.controller;



import com.netctoss_springboot.pojo.Admin;
import com.netctoss_springboot.service.LoginService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("login")
public class LoginController {
    @Resource
    private LoginService loginService;
    static Admin a;

    @RequestMapping("toupdate")
    public ModelAndView toupdate(Integer adminId, ModelAndView mav) {
        Admin login = loginService.findLoginInfoByAdminId(adminId);
        mav.setViewName("user/user_info");
        mav.addObject("login", login);
        return mav;
    }

//    @RequestMapping("loginshow")
//    public ModelAndView login(ModelAndView mav) {
//        Admin admin = new Admin();
//        mav.setViewName("login/login");
//        mav.addObject("admin", admin);
//        return mav;
//    }

//    @RequestMapping("check")
//    public ModelAndView check(Admin admin, ModelAndView mav) {
//        try {
//            a = loginService.Checklogin(admin);
//        } catch (NullPointerException e) {
//            mav.setViewName("redirect:../index.jsp");
//        }
//        try {
//            if (a == null) {
//                mav.setViewName("redirect:../index.jsp");
//            } else {
//                mav.setViewName("user/user_info");
//                mav.addObject("admin", a);
//                mav.setViewName("user/user_modi_pwd");
//                mav.addObject("admin", a);
//                mav.setViewName("redirect:../index.jsp");
//            }
//        } catch (NullPointerException e) {
//            mav.setViewName("redirect:../index.jsp");
//        }
//
//        return mav;
//    }
}






