package com.woo.wrhorse.generic;


import java.util.*;

/**
 * Created by User on 2016/4/24.
 */
public class GenericTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("ssss");
//        list.add("dsdsd");
//        list.add("aaa");
//        list.add(100);


//        for (String name : list) {
//            System.out.println(name);
//        }

//        System.out.println(list.getClass());
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

//        Box<String> box = new Box<>("corn");
//        System.out.println(box.getData());
//        System.out.println(box.getClass());
//        Box<Integer> age = new Box<>(712);
//        System.out.println(age.getData());
//        System.out.println(age.getClass());
//        System.out.println(box.getClass() == age.getClass());
//        Box<Number> name = new Box<Number>(99);
        Box<String> name = new Box<String>("corn");
        Box<Integer> age = new Box<Integer>(712);
        Box<Number> number = new Box<Number>(314);

//        getData(name);
        getData(age);
        getData(number);

    }

    private static void getData(Box<? extends Number> data) {
        System.out.println("data: " + data.getData());
        System.out.println("class: " + data.getClass());
    }
}
