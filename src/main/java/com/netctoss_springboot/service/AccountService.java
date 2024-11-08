package com.netctoss_springboot.service;


import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Account;
import com.netctoss_springboot.pojo.SearchCondition;

public interface AccountService {
    Account findByAccountId(Integer accountId);

    PageInfo findByPageAndCondition(SearchCondition condition, Integer pageNum);

    boolean updateAccount(Account account);

    boolean deleteAccount(Integer accountId);

    boolean changeStatus(Integer accountId);

    void addAccount(Account account);
}
