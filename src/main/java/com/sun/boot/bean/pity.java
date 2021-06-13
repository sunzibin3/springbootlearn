package com.sun.boot.bean;

public class pity {
    private String name;

    public pity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "pity{" +
                "name='" + name + '\'' +
                '}';
    }
}
