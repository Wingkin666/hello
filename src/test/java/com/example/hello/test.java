package com.example.hello;


public class test {

    public static void main(String[] args) {
        PeopleImpl peopleImpl = new PeopleImpl();
        People people = new People();
        peopleImpl.preExecute(people);
        System.out.println(people.toString());
        System.out.println("dev");
    }
}
