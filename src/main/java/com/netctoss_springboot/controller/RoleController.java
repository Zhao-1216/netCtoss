package com.netctoss_springboot.controller;



import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Role;
import com.netctoss_springboot.service.RoleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.Arrays;

@Controller
@RequestMapping("role")
public class RoleController {
    @Resource
    private RoleService roleService;

    @RequestMapping("findByPage")
    public ModelAndView findByPage(Integer pageNum,ModelAndView mav){
        if(StringUtils.isEmpty(pageNum)){
            pageNum = 1;
        }
        PageInfo pageInfo = roleService.findByPage(pageNum);
        mav.setViewName("/role/role_list");
        mav.addObject("pageInfo",pageInfo);
        return mav;
    }


    @RequestMapping("toAdd")
    public ModelAndView toAdd(ModelAndView mav){
        Role role = new Role();
        mav.setViewName("role/role_add");
        mav.addObject("role",role);
        return mav;
    }

//    @RequestMapping("addRole")
//    public ModelAndView addRole(String roleName, List<Privilege> privilegeIds,ModelAndView mav){
//        System.out.println("-----------------------------------");
//        roleService.addRoleAndPrivilege(roleName,privilegeIds);
//        mav.setViewName("redirect:findByPage");
//        return mav;
//    }

    @RequestMapping("addprivilege")
    public ModelAndView addprivilege(Role role,Integer[] privilegeId, ModelAndView mav) {
        System.out.println(Arrays.toString(privilegeId));
        roleService.addprivilege(role.getRoleName());
        for (int i = 0; i < privilegeId.length; i++){
            roleService.addprivilege2(privilegeId[i]);
        }
        mav.setViewName("redirect:findByPage");
        return mav;
    }

    @RequestMapping("toUpdate")
    public ModelAndView toUpdate(Integer roleId,int page,ModelAndView mav){
        Role role = roleService.findRoleAndPri(roleId);
        mav.setViewName("/role/role_modi");
        mav.addObject("role",role);
        mav.addObject("page",page);
        return mav;
    }


    @RequestMapping("updateRole")
    public ModelAndView updateRole(Role role,int page,ModelAndView mav){
        roleService.updateRole(role);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("deleteRole")
    public ModelAndView deleteRole(Integer roleId,int page,ModelAndView mav){
        roleService.deleteRole(roleId);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }


}
