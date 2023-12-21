package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        //1-100中逢七或者七的倍数喊过；

        for (int i = 1; i <= 100; i++) {
            //分析：个位 7，十位 7 ，7倍数
            if (i % 10 == 7 || i /10 % 10 == 7 || i % 7 == 0) {
                System.out.println("是：" + i + "，过！！！");
                continue;
            }
            System.out.println(i);
        }
    }
}
