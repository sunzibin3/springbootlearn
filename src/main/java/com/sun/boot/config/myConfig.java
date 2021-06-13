package com.sun.boot.config;


import com.sun.boot.bean.Human;
import com.sun.boot.bean.pity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 * Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 * Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 * 组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *
 */

//@Configuration(proxyBeanMethods = true) //告诉SpringBoot这是一个配置类
@Configuration
public class myConfig {

    @Bean("human01")//给容器添加组件，组件默认id为方法名,组件类型为返回类型
    public Human human01(){
        return new Human("人","14");
    }

    @Bean("Pity01")
    public pity pity(){
        return  new pity("宠物");
    }
}
