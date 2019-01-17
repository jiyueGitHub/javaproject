package com.jiyue.study;

import java.util.Scanner;

public class Demo30 {
    public static void main(String[] args) {
        /**为新员工分配部门
         * 实例说明：
         * 本实例根据用户输入的信息确定员工应该分配到哪个部门
         *  实例中需要根据用户输入进行多条件判断，所以采用了Switch语句
         *
         *  关键技术：
         *  本实例的关键技术在于Switch多分支语句的使用，该语句只支持对常量的判断。
         *  而常量又只能是Java的基本数据类型。
         *  虽然在以后的JDK版本中可以对String类的字符串对象进行判断，
         *  但是就目前项目的需求来说也有很多需要对字符串进行多条件判断的。
         *
         *  本实例采取的做法是对字符串的哈希码进行判断。
         *  也就是把String类的hashCode()方法返回值作为Switch语法表达式
         *  case关键字之后跟随的是各种字符串常量的哈希码整数值
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新员工的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入新员工应聘的编程语言");
        String language = sc.nextLine();
        //根据编程语言确定员工分配的部门
        switch(language.hashCode()){
            case 3254818:
            case 2301506:
            case 2269730:
                System.out.println("员工" + name + "被分配到Java程序开发部门。");
                break;
            case 2112:
                System.out.println("员工" + name + "被分配到C#项目维护组。");
                break;
             default:
             System.out.println("本公司不需要" + language + "语言的程序开发人员");
        }
        /**秘笈心法：灵活使用switch语法
         * 在switch语法中，每个case关键字可以作为一个条件分支。
         * 但是对于多个条件采取相同业务处理的情况，可以把多个case分支关联在一起
         * 省略他们之间的break语句，而在最后一个相同的case分支中实现业务处理并执行break语句
         *
         */
    }
}
