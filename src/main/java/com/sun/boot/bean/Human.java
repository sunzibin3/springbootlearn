package com.sun.boot.bean;

public class Human {
    private String name;
    private String age;

    public Human(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
