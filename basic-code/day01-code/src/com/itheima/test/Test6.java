package com.itheima.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        /*
        * 秘诀
        * 用来生成任意数到任意数的随机数 例子：7~15/10~56
        * 1、让这个范围头尾都减去一个值，让这个范围从0开始 例子：（-7，那就是0~8）/（-10，那就是0~46）
        * 2、尾巴+1    例子：（那就是8+1=9）/（那就是46+1=47）
        * 3、最终的结果，再加上第一步减去的值。
        * */
        /*Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(47) + 10;
            System.out.println(number);
        }*/

        int[] arr1 = {24, 4, 6, 7, 98};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
