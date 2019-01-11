package com.ratel.poi.entity;

/**
 * @ 业务描述：
 * @ Package_name：com.ratel.easypoi
 * @ Project_name：easypoi
 * @ Author：ratelfu@qq.com
 * @ Create_time：2019-01-11 9:45
 * @ Copyright (c) ratelfu 版权所有
 */
public class Person {

    private  String id;
    private  String name;


    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
