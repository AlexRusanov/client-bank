package com.clientBank.dao;

import com.clientBank.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDao implements Dao<Account>{

    @Override
    public Account save(Account obj) {
        return null;
    }

    @Override
    public boolean delete(Account obj) {
        return false;
    }

    @Override
    public void deleteAll(List<Account> entities) {

    }

    @Override
    public void saveAll(List<Account> entities) {

    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public Account getOne(long id) {
        return null;
    }
}
