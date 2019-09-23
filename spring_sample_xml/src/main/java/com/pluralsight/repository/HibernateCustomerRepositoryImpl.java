package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    //setter for setting property from app.properties by wiring in context xml
//    public void setDbUsername(String dbUsername) {
//        this.dbUsername = dbUsername;
//    }

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);
        List<Customer> customerList = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Marek");
        customer.setLastName("Patarak");
        customerList.add(customer);

        return customerList;
    }
}
