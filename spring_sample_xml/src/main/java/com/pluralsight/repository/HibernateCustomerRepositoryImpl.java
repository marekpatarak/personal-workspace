package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {

        List<Customer> customerList = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Marek");
        customer.setLastName("Patarak");
        customerList.add(customer);

        return customerList;
    }
}
