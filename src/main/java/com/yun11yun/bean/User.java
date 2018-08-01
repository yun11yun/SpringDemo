package com.yun11yun.bean;

import java.util.List;

public class User {
    private String name;
    private int age;

    private Phone phone;

    private List<Phone> otherPhones;

    private static User user = new User();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List <Phone> getOtherPhones() {
        return otherPhones;
    }

    public void setOtherPhones(List <Phone> otherPhones) {
        this.otherPhones = otherPhones;
    }

    public static User createUser() {
        return user;
    }
}
