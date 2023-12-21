package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //回文数
        //给定一个整数 X
        //判定是否回文数，是打印true，不是打印false；
        //例如：121是回文数，123不是；

        //定义一个整数、或者键盘录入
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();*/
        int x = 232;
        //定义临时整数，用于循环修改值用
        int temp = x;
        //最终数字
        int sum = 0;

        while (temp != 0) {
            int ge = temp % 10;
            sum = sum * 10 + ge;
            temp = temp / 10;
        }

        //打印结果
        System.out.println(x);
        System.out.println(sum);
        System.out.println(sum == x);
    }
}
