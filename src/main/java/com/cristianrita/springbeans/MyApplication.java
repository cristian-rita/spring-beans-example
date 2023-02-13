package com.cristianrita.springbeans;

import com.cristianrita.springbeans.config.MyApplicationConfig;
import com.cristianrita.springbeans.services.Sender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
        System.out.println("Application started!");
        Thread.sleep(5000);
        Sender emailService = applicationContext.getBean(Sender.class);
        emailService.send("test@email.com", "Hello World!");
    }
}
