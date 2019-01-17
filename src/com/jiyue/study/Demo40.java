package com.jiyue.study;

public class Demo40 {
    public static void main(String[] args) {
        /** 循环体的过滤器
         *  实例说明：
         *     循环体中可以通过break语句中断整个循环，
         *
         */
        String str[] = new String[]{"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","喜鹊","老鹰","布谷鸟","老鹰","灰纹鸟","老鹰","百灵鸟"};
        System.out.println("在我的花园里有很多鸟类，但是最近来了几只老鹰，请帮我把它们抓走。");

        int eagleCount = 0;

        for (String  birds : str) {
            if (birds.equals("老鹰")) {
                System.out.println("发现一只老鹰，已经抓到笼子里。");
                eagleCount++;
                continue;
            }
            System.out.println("搜索鸟类，发现了：" + birds);
        }
        System.out.println("一共抓到了：" + eagleCount + "只老鹰、");
    }
}
