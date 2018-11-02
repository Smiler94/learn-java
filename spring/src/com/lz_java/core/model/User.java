package com.lz_java.core.model;

public class User {
    public User() {

    }
    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    private int id;

    private String name;

    private int age;

    @Override
    public String toString() {
        return "UserDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
