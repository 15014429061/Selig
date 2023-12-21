package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        //键盘录入一个数字 获取个位 十位 百位
        //键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数字");

        int i = sc.nextInt();

        int ge = i % 10;
        int shi = i / 10 % 10;
        int bai = i / 100 % 10;
        //获取个位
        System.out.println("个位是 " + ge);
        //获取十位数
        System.out.println("个位是 " + shi);
        //获取百位数
        System.out.println("个位是 " + bai);

    }

}
