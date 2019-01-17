package com.jiyue.study;

import java.util.Scanner;

public class Demo34 {
    public static void main(String[] args) {
        /**
         * 杨辉三角
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要显示的行数：");
        int row = sc.nextInt();
        int triangle[][] = new int[row][];
        for(int out = 0; out < triangle.length; out++ ){
            triangle[out] = new int[out + 1];                                       //外层数组创建一个内层数组
            for(int in = 0; in < triangle[out].length; in++){
                if(out == 0 || in == 0 || in == triangle[out].length - 1){          //判断是否是开始和结束，是就赋值1
                    triangle[out][in] = 1;
                } else {
                    triangle[out][in] = triangle[out - 1][in] + triangle[out - 1][in - 1];  //上层+上层左侧相加
                }
                System.out.print(triangle[out][in] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
