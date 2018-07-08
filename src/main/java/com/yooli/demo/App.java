package com.yooli.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PY on 2018/7/7.
 */
public class App {

    public static void main(String[] args) {
        List<User> lists=new ArrayList<>();
        for (int i=0;i<10;i++){
            lists.add(new User(i,"name"+String.valueOf(i)));
            System.out.println(lists.get(i));
        }

        int i=10;
        System.out.println("8882");
    }
}
