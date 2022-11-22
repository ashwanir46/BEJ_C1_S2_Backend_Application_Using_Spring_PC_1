package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {

        @Bean("Product1")
        public Product getProduct1(){
            return new Product(101,"Mobile",1199,4,"for calling and other work");
        }

    @Bean("Product2")
    public Product getProduct2(){
        return new Product(102,"Laptop",12399.99,5,"for office work and other work");
    }
}
