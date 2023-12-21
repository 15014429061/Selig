package com.itheima.demo1;

public class HelloWorld {
    public static void main(String[] args) {
        //注释
        System.out.println("HelloWorld！中国");


        System.out.println(10/2);
        System.out.println(10/3);

        System.out.println(10%2);
        System.out.println(10%3);

        System.out.println("----------------");

        int var = 10;
        int a = 5;
        int b = 6;
        if ((var % a) == 0 ) {
            System.out.println("a可以被整除");
        } else if ((var % b) == 0) {
            System.out.println("b可以被整除");
        } else {
            System.out.println("都没有被整除数字");
        }

        System.out.println("------华丽的分割线-------");
        char str = '中';
        System.out.println(str + 0);
        System.out.println("------华丽的分割线-------");
        System.out.println(4.7 + str);


        System.out.println("------原码，反码，补码-------");

        int aa = 300; // 0000 0000 0000 0000 0000 0001 0010 1100
        byte bb = (byte) aa; // 0010 1100
        System.out.println(bb);

        System.out.println("------逻辑与，逻辑或-------");

        int yu = 200;
        int huo = 10;
        System.out.println(yu & huo);
        System.out.println(yu | huo);

        System.out.println("------左移 << ，右移 >> ，无符号右移 >>> -------");

        int zuo = 200;
        int you = 200;
        int wuYou = 200; //无符号右移 >>>，和右移一样，不过高位是补0
        System.out.println(zuo * 4); //
        System.out.println(zuo << 2); //口诀：左移1位乘以2，2位乘以4...

        System.out.println(you / 4); //
        System.out.println(you >> 2); //口诀：右移1位除以2，2位除以4...

    }
}
