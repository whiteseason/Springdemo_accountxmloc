package com.itheima.dao;

import com.itheima.doman.Account;

import java.util.List;

/**
 * 账户的持久层接口
 */
public interface IaccountDao {
    /**
     *查询所有
     * @return
     */
    List<Account> findAllAccount();
    /**
     * 查询一个
     */
    Account findAccountById(Integer id);
    /**
     * 保存
     */
    void  saveAccount(Account account);
    /**
     * 更新
     */
    void updataAccount(Account account);
    /**
     * 删除
     */
    void delectAccount(Integer id);
}
