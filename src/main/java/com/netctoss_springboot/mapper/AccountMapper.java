package com.netctoss_springboot.mapper;
import com.netctoss_springboot.pojo.Account;
import com.netctoss_springboot.pojo.SearchCondition;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface AccountMapper {
    Account findByAccountId(Integer accountId);

    List<Account> findAll(SearchCondition condition);

    void addAccount(Account account);

    boolean updateAccount(Account account);

    boolean deleteAccount(Integer accountId);

    boolean changeStatus(Integer accountId);

}
