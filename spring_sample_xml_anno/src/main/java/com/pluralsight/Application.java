package com.pluralsight;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService customerService = appContext.getBean("customerService", CustomerService.class);

        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
