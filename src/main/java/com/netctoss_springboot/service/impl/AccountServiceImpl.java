package com.netctoss_springboot.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.mapper.AccountMapper;
import com.netctoss_springboot.pojo.Account;
import com.netctoss_springboot.pojo.SearchCondition;
import com.netctoss_springboot.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;
    private int pageSize=3;
    private int navigatePages=5;

    @Override
    public Account findByAccountId(Integer accountId) {
        return accountMapper.findByAccountId(accountId);
    }
    @Override
    public PageInfo findByPageAndCondition(SearchCondition condiition, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Account> accounts= accountMapper.findAll(condiition);
        PageInfo pageInfo=new PageInfo(accounts,navigatePages);
        return pageInfo;
    }

    @Override
    public boolean updateAccount(Account account) {
        return accountMapper.updateAccount(account);
    }

    @Override
    public boolean deleteAccount(Integer accountId) {
        return accountMapper.deleteAccount(accountId);
    }

    @Override
    public boolean changeStatus(Integer accountId) {
        return accountMapper.changeStatus(accountId);
    }

    @Override
    public void addAccount(Account account) {
        accountMapper.addAccount(account);
    }
}
