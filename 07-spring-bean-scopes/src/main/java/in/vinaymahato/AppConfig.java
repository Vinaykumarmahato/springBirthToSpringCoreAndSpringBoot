package in.vinaymahato;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class AppConfig {
@Bean
public OrderServices getOrder1(){
    return new  OrderServices();
}
@Bean
public OrderServices getOrder2(){
    return new  OrderServices();
}
}
