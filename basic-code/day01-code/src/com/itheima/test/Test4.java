package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        //给定两个整数，被除数和除数（都是正数，且不能超过int的范围）
        //将两个数相除，要求不能使用乘法、除法和%运算符。
        //得到余数和商
        //公式：被除数 / 除数 = 商.....余数

        //定义两个整数
        int nmb1 = 6457;//被除数
        int nmb2 = 34; //除数

        //定义两个值
        int shang = 0;//商
        int yu = nmb1;//余数

        while (yu >= nmb2) {
            shang++;
            yu = yu - nmb2;
        }

        System.out.println("商是：" + shang);
        System.out.println("余数是：" + yu);

    }
}
