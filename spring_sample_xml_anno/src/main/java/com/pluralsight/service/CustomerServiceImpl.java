package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service - same as @Component(any POJO), just marks class where business logic should reside (its not web service)
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

//    @Autowired member injection
//    @Autowired
    private CustomerRepository customerRepository;

//    @Autowired constructor injection
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

//    @Autowired setter injection
//    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
