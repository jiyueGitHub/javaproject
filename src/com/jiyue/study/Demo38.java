package com.jiyue.study;

import java.util.ArrayList;
import java.util.List;

public class Demo38 {
    public static void main(String[] args) {
        /**foreach循环由于for循环
         *实例说明：
         * JDK1.5为Java添加了新的for循环foreach。
         * 它是原有for循环遍历数据的一种简写格式，使用的关键字依然是for。
         * 但是参数格式不同。
         * 本例使用foreach循环分别遍历集合对象与数组，并把元素值输出到控制台。
         *
         * 关键技术：
         * foreach循环是for循环的一种简写格式，只用于遍历数据集合或数组。
         * 语法：
         * for(Type e:collections)
         * 参数说明：
         * 1、e：其类型Type是集合或数组中元素值的类型，该参数是集合或数组collections中的一个元素
         * 2、collections:要遍历的集合或数组，也可以是迭代器。
         * 说明：在循环体中使用参数e，该参数是foreach从集合或数组以及迭代器中取得的元素值，
         * 元素值是从头到尾进行遍历的。
         *
         * 设计过程：
         *  在该类的主方法中创建List集合对象，并为该对象添加内容。
         *  然后使用foreach循环遍历该集合输出所有内容，再从List集合中提取一个字符串数组，
         *  然后使用foreach循环遍历该数组，并将数组元素输出到控制台。
         * */

        List<String > list = new ArrayList<String>();          //创建List集合
        list.add("abc");
        list.add("def");
        list.add("hij");
        list.add("klm");
        list.add("nop");
        list.add("qrs");

        System.out.println("foreach遍历集合:");

        for (String str:list) {                                     //遍历List集合
            System.out.print(str);                                  //输出集合的元素值
        }
        System.out.println();

        String strs[] = new String[list.size()];
        list.toArray(strs);

        System.out.println("\nforeach遍历数组");
        for (String str1 : strs) {                                  //遍历数组
            System.out.print(str1);                               //输出数组元素值
        }

        /**秘笈心法：
         * 在JDK1.5之前使用for循环对集合、数组和迭代器进行遍历，需要创建索引变量、条件表达式
         *这样会造成代码混乱，并增加出错几率，并且每次循环中索引变量或迭代器都会出现3次，
         * 有两次出错的机会，而且会有一些性能损失，其性能稍微落后于foreach循环。
         * 所以对于数据集合的遍历，建议使用foreach循环来完成
         *
         */
    }
}
