package com.example.customerapp.service;

import com.example.customerapp.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer createCustomer(Customer customer); // save the customer data

    List<Customer> getAllCustomers(); // show all the customers

    Optional<Customer> getCustomerById(Long id); // to show customer by id

    Customer updateCustomer(Long id, Customer customer); // to update customer data

    void deleteCustomer(Long id); // delete customer by id
}
