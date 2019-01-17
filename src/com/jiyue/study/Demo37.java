package com.jiyue.study;

import java.util.Scanner;

public class Demo37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你想要的菱形大小：");
        int size = sc.nextInt();
        System.out.println("您输入的是：" + size );
        printRhombus(size);
        sc.close();
    }
    public static void printRhombus(int size){
        if(size % 2 == 0){                            //判断是否为偶数，如果偶数+1
            size++;
        }
        int position = size/2 + 1;                   //判断中间位置
        int upPosition = 0;                          //为上块打印*位置申请的变量
        int dowmPosition = 0;                       //为下块打印*位置申请的变量

        int upPositionBefore = 0;                   //上块的前面*位置
        int upPositionAfter = 0;                    //上块的后面*位置
        int dowmPositionBefore = 0;                 //下块的前面*位置
        int dowmPositionAfter = 0;                  //下块的后面*位置

        for(int row = 1; row <= size; row++ ){
            upPosition = row - 1;
            dowmPosition = size - row;
            upPositionBefore = position - upPosition;
            upPositionAfter = position + upPosition;
            dowmPositionBefore = position - dowmPosition;
            dowmPositionAfter = position + dowmPosition;


            if(row == 1 || row == size){                //如果是第一行和最后一行打印一颗星
               for(int space = 1; space <= size; space++) {
                   if (space == position) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
                continue;
            }

            if(row == position){                        //如果是中间行，打印第一和最后两个星
                for(int space = 1; space <= size; space++) {
                    if (space == 1 || space == size) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                continue;
            }


            //if(row < position && row != 1){
            if(row < position){
                for(int space = 1; space <= size; space++ ){
                    if(space ==  upPositionBefore || space == upPositionAfter){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            if(row > position && row != 1 && row != size){
                for(int space = size; space >= 1; space-- ){
                    if(space == dowmPositionBefore|| space == dowmPositionAfter){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
