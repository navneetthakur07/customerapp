package com.example.customerapp.repository;

import com.example.customerapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Create a repository interface that extends JpaRepository to handle database operations
    // for the Customer entity.
}
