package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        String str = "HelloWorld";
        Class<? extends String> strClass =  str.getClass();
        System.out.println(strClass.getName());
        System.out.println(a);
        System.out.println(b);

    }
}
