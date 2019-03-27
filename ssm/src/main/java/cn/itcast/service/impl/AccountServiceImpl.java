package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: JAVA类作用描述
 * @Author :胡辉
 * @CreatDate: 2019/3/21 19:37
 * @Version : 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    public void saveAccount(Account account) {
        System.out.println("业务层保存了用户！");
        accountDao.saveAccount(account);
    }

    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户！");
        return accountDao.findAll();
    }
}
