package com.itheima.service.impl;

import com.itheima.dao.IaccountDao;
import com.itheima.doman.Account;
import com.itheima.service.IaccountService;

import java.util.List;

/**
 * 账户的业务层的实现类
 */
public class AccountServiceImpl implements IaccountService {

    private IaccountDao accountDao;

    public void setAccountDao(IaccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updataAccount(Account account) {
        accountDao.updataAccount(account);
    }

    public void delectAccount(Integer id) {
        accountDao.delectAccount(id);
    }
}
