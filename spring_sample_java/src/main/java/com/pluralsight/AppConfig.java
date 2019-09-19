package com.pluralsight;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
// autowiring
@ComponentScan({"com.pluralsight"})
public class AppConfig {

//     automatic discovery of bean with @Repository annotation on HibernateCustomerRepo...
//    same could be possible with @Service at CustomerServiceImpl
    @Bean(name="customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }

    //setter injection
    @Bean(name="customerService")
//    bean definition in class may be overriden by this config
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //Beans by default singletons
    public CustomerService getCustomerService() {
//        setter injection
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());

//        constructor injection
//        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());

//        Autowiring
//        CustomerService customerService = new CustomerServiceImpl();

        return customerService;
    }

}
