package com.jiyue.study;

public class Demo39 {
    public static void main(String[] args) {
        /**终止循环体
         *实例说明：
         * 循环用于复杂的业务处理可以提高程序的性能和代码的可读性。
         * 但是循环中也有特殊情况，例如，由于某些原因需要立刻中断循环去执行下面的业务逻辑。
         * 使用break语句实现了中断循环。
         *
         * 设计过程：
         * 在该类主方法中创建一个字符串数组，在使用foreach遍历时，判断
         * 如果发现数组中包含字符串“老鹰”则立刻中断循环。
         * 在创建一个整数类型的二维数组，使用双层foreach循环遍历。
         * 当发现第一个小于60的数组元素时，则立刻中断整个双层循环而不是内层循环。
         *
         *
         */

        System.out.println("---------中断单层循环的例子----------");

        String str[] = new String[]{"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","喜鹊","老鹰","布谷鸟","老鹰","灰纹鸟","老鹰","百灵鸟"};
        System.out.println("在你发现第一只老鹰之前，告诉我都有什么鸟");

        for (String birds : str) {
            if (birds.equals("老鹰")) {
                break;
            }
            System.out.println("有：" + birds + "\t");
        }

        System.out.println("\n\n------------------中断双层循环的例子------------------------");

        int myScores[][] = new int[][] {{67,78,63,22,66},{55,68,78,95,44},{95,97,92,93,81}};

        System.out.println("宝宝这次考试成绩：\n数学 \t语文 \t英语 \t美术 \t历史");
        No1:for (int is[] : myScores) {                       //遍历成绩表格
            for (int i : is) {
                System.out.print(i + "\t\t");
                if (i < 60) {   //如果中途遇到不及格的，立刻中断所有输出
                    System.out.println("\n等等," + i + "分的是什么？这个为什么不及格");
                    break No1;
                }
            }
        }

        /**秘笈心法：用break避免死循环
         *充分利用循环可以提高程序的开发与执行效率，但是如果不注重循环中的算法将很容易导致程序死循环。
         *
         */
    }
}
