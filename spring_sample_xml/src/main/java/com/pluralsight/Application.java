package com.pluralsight;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

//        CustomerService customerService = new CustomerServiceImpl();

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService customerService = appContext.getBean("customerService", CustomerService.class);

        System.out.println(customerService.findAll().get(0).getFirstName());

        System.out.println(customerService);

        // we get still the same object because scope is singleton
        CustomerService customerService2 = appContext.getBean("customerService",CustomerService.class);

        System.out.println(customerService2);
    }
}
