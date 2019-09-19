package com.pluralsight;

import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);

        System.out.println(customerService);

        // we get still the same object because scope is singleton
        CustomerService customerService2 = applicationContext.getBean("customerService",CustomerService.class);

        System.out.println(customerService2);

        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
