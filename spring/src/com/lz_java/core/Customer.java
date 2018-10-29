package com.lz_java.core;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
    @Autowired
    private Person person;

    private int type;
    private String action;

    public Person getPerson() {
        return person;
    }

    //@Autowired   可以加在getter、构造函数、属性上
    public void setPerson(Person person) {
        this.person = person;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "person=" + person +
                ", type=" + type +
                ", action='" + action + '\'' +
                '}';
    }
}
