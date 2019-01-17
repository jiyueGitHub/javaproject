package com.jiyue.study;

import java.util.Scanner;

public class Demo28 {
    public static void main(String[] args) {
        /**判断某一年是否为闰年
         * 为了弥补因人为立法规定造成的年度天数与地球实际公转周期的时间差，
         * 设了了366天的闰年，闰年2月份有29天。
         * 关键技术：公式
         *  第一：能被4整除但不能被100整除
         *  第二：能被400整除
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        long year = sc.nextLong();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "是闰年！");
        }else{
            System.out.println(year + "不是闰年");
        }
        /**简单的if。。else语句
         *三元运算符"?:"是if。。else语句的一个简洁写法，
         * 开发人员可以根据需求来决定使用哪一个。
         * if。。。else常用语赋值判断
         * “？：”常用于业务流程
         */
    }
}
