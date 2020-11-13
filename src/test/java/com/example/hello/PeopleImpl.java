package com.example.hello;

public class PeopleImpl {
    public void preExecute(People people) {
        //获取信息
        get( people );

        change(people);
    }
    private void get(People people){
        people.setName("吴彦祖");
        people.setAge("45");
        people.setSex("男");
    }
    private void change(People people){
        people.setAge("46");
    }
}
