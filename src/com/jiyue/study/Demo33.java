package com.jiyue.study;


public class Demo33 {
    public static void main(String[] args) {
        String birds[] = new String[]{"子鼠","丑牛","寅虎","卯兔","辰龙","巳蛇","午马","未羊","申猴","酉鸡","戌狗","亥猪"};
        int counter = 0;
        System.out.println("十二生肖包括：");
        while(counter < birds.length){
            System.out.print(birds[counter++] + "  ");
        }
    }
}
