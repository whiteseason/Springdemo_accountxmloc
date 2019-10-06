package com.itheima.service.impl;

import com.itheima.doman.Account;
import com.itheima.service.IaccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountServiceImplTest {

    @Test
    public void setAccountDao() {

    }

    @Test
    public void findAllAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IaccountService as = ac.getBean("accountService",IaccountService.class);
        List<Account> accounts = as.findAllAccount();
        for (Account a :
                accounts) {
            System.out.println(a.toString());
        }
    }

    @Test
    public void findAccountById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IaccountService as = ac.getBean("accountService",IaccountService.class);
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("ddd");
        account.setMoney(10000);
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IaccountService as = ac.getBean("accountService",IaccountService.class);
        as.saveAccount(account);
    }

    @Test
    public void updataAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IaccountService as = ac.getBean("accountService",IaccountService.class);
        Account account = as.findAccountById(4);
        account.setMoney(23456);
        as.updataAccount(account);
        findAllAccount();
    }

    @Test
    public void delectAccount() {
    }
}