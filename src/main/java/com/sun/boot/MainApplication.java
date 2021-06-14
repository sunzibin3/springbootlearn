package com.sun.boot;

import com.sun.boot.bean.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication(scanBasePackages = "com.sun.boot")
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        Human human01 = run.getBean("human01", Human.class);
        System.out.println(human01);
    }
}
