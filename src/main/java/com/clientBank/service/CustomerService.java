package com.clientBank.service;

import com.clientBank.dao.CustomerDao;
import com.clientBank.model.Account;
import com.clientBank.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public Customer getCustomerById(Long id) {
        return customerDao.getOne(id);
    }

    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }

    public Customer createCustomer(Customer customer) {
        customer.setId();
        customer.setAccounts(new ArrayList<>());
        return customerDao.save(customer);
    }

    public boolean updateCustomer(Customer customer) {
        return customerDao.update(customer);
    }

    public boolean deleteCustomer(Customer customer) {
        return customerDao.delete(customer);
    }

    public Account createAccountForCustomer(Account account, Long id) {
        account.setId();
        return customerDao.createAccount(account, id);
    }

    public boolean deleteAccountFromCustomer(Account account, Long id) {
        return customerDao.deleteAccount(account, id);
    }
}
