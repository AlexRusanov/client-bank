package com.clientBank.service;

import com.clientBank.dao.AccountDao;
import com.clientBank.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

}
