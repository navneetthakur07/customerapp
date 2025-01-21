package com.example.customerapp.service;

import com.example.customerapp.entity.Customer;
import com.example.customerapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{

    @Autowired
    public CustomerRepository customerRepository;

    // create customer
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Get All Customer
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Get Customer by Id
    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    // to update customer details with id
    @Override
    public Customer updateCustomer(Long id, Customer customerDetails) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        customer.setFirstName(customerDetails.getFirstName());
        customer.setLastName(customerDetails.getLastName());
        return customerRepository.save(customer);
    }

    // Delete Customer
    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
