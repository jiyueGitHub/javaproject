package com.jiyue.study;

import java.util.Scanner;

public class Demo29 {
    public static void main(String[] args) {
        /**验证登录信息的合法性
         * 实例说明：
         * 多数系统登录模块都会接收用户通过键盘输入的登录信息，
         * 这些登录信息将会被登录模块验证。
         * 如果使用的是指定的用户名和密码，则允许用户登录，否则不可
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入登录用户名：");
        String username = sc.nextLine();
        System.out.println("请输入登录密码：");
        String password = sc.nextLine();

        if(!username.equals("mr")){
            System.out.println("用户名非法");
        }else if(!password.equals("mrsoft")){
            System.out.println("登录密码错误");
        }else{
            System.out.println("登录成功");
        }
        /**秘笈心法：判断字符串是否相同
         *字符串属于对象而非基本数据类型，不能使用 “==”来判断两个字符串是否相同
         * 所以需要equals()方法来判断两个字符串内容是否相同
         * 如果使用“==”，判断的将是两个字符串对象的内存地址，而非字符串内容
         * */
    }
}
