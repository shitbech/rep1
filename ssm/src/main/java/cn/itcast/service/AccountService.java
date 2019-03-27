package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {

    /**
     * 保存用户
     * */
    public void saveAccount(Account account);


    /**
     * 查询所有用户
     * */
    public List<Account> findAll();
}
