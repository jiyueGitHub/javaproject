package com.jiyue.study;

import java.util.Scanner;

public class Demo27 {
    public static void main(String[] args) {
        /**实现两个变量的互换（不借助第三个变量）
         *变量的互换常见于数组排序算法中，当判断两个数组元素需要交换时，
         * 将创建一个临时变量来共同完成互换，临时变量的创建增加了系统资源的消耗。
         * 如果需要交换的是两个整数类型的变量，那么可以使用更高效的方法。
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入变量A的值：");
        long a = sc.nextLong();
        System.out.println("请输入变量B的值：");
        long b = sc.nextLong();

        System.out.println("a = " + a + "\tb = " + b);
        System.out.println("执行变量互换...");

        a = a ^ b;
        System.out.println("a交换后: = " + a);
        b = b ^ a;
        System.out.println("b交换后: = " + b);
        a = a ^ b;
        System.out.println("a = " + a + "\tb = " + b);
        /**秘笈心法：别忘记赋值
         * 异或“^”和其他位运算符并不会改变变量本身的值。
         * 即a^b，没有任何意义，必须将运算结果赋值给一个变量，
         * 一些开发人员经常犯此类错误。
         * 异或运算(^)都以二进制数据为基础进行的运算。也就是说当代码中使用到异或运算时，
         * 都会先将两个条件进行转换，转换成二进制数据后，再进行运算。
         * 异域中同位如果值相同（都是0或者都是1）则为0，不同（一个是0，一个是1）为1。
         * */
    }
}
