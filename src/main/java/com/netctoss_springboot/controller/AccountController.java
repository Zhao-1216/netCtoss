package com.netctoss_springboot.controller;



import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Account;
import com.netctoss_springboot.pojo.SearchCondition;
import com.netctoss_springboot.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("account")
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("findByAccountId")
    public ModelAndView findByAccountId(Integer accountId,ModelAndView mav){
        Account account = accountService.findByAccountId(accountId);
        mav.setViewName("account/account_detail");
        mav.addObject("account",account);
        return mav;
    }
    @RequestMapping("findByPage")
    public String findByPage(SearchCondition condition, Integer pageNum, Model model){
        if(StringUtils.isEmpty(pageNum)){
            pageNum = 1;
        }
        PageInfo pageInfo = accountService.findByPageAndCondition(condition,pageNum);
        model.addAttribute("condition",condition);
        model.addAttribute("pageInfo",pageInfo);
        return "account/account_list";
    }
    @RequestMapping("toUpdate")
    public ModelAndView toUpdate(Integer accountId,int page,ModelAndView mav){
        Account account = accountService.findByAccountId(accountId);
        Account account2 = new Account();
        mav.setViewName("account/account_modi");
        mav.addObject("account",account);
        mav.addObject("account2",account2);
        mav.addObject("page",page);
        return mav;
    }
    @RequestMapping("updateAccount")
    public ModelAndView updateAccount(Account account,Account account2, int page,ModelAndView mav){
        account.setAccountId(account2.getAccountId());
        accountService.updateAccount(account);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }
    @RequestMapping("deleteAccount")
    public ModelAndView deleteAccount(Integer accountId,int page,ModelAndView mav){
        accountService.deleteAccount(accountId);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("changeStatus")
    public ModelAndView changeStatus(Integer accountId,int page,ModelAndView mav){
        accountService.changeStatus(accountId);
        mav.setViewName("redirect:findByPage?pageNum="+page);
        return mav;
    }

    @RequestMapping("toAdd")
    public ModelAndView toAdd(ModelAndView mav){
        Account account = new Account();
        mav.setViewName("account/account_add");
        mav.addObject("account",account);
        return mav;
    }

    @RequestMapping("addAccount")
    public ModelAndView addAccount(Account account,ModelAndView mav){
        accountService.addAccount(account);
        mav.setViewName("redirect:findByPage");
        return mav;
    }


}
