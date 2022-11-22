package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Product product1 = context.getBean("Product1",Product.class);
        System.out.println(product1);

        Product product2 = context.getBean("Product2",Product.class);
        System.out.println(product2);
     }
}
