package com.clientBank.controller;

import com.clientBank.model.Account;
import com.clientBank.model.Customer;
import com.clientBank.service.AccountService;
import com.clientBank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/customers")
    public boolean updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/customers")
    public boolean deleteCustomer(@RequestBody Customer customer) {
        return customerService.deleteCustomer(customer);
    }

    @PostMapping("/customers/{id}/create-account")
    public Account createAccountForCustomer(@RequestBody Account account, @PathVariable Long id) {
        return customerService.createAccountForCustomer(account, id);
    }

    @DeleteMapping("/customers/{id}/delete-account")
    public boolean deleteAccountFromCustomer(@RequestBody Account account, @PathVariable Long id) {
        return customerService.deleteAccountFromCustomer(account, id);
    }
}
