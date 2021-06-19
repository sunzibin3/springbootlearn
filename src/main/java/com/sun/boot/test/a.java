package com.sun.boot.test;

public interface a {
    default void hello(){
        System.out.println("hello");
    }
    boolean login(String username, String password);

    static  void say(){
        System.out.println("sad");
    }
}
