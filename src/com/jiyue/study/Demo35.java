package com.jiyue.study;

public class Demo35 {
    public static void main(String[] args) {
        //九九乘法表
        int multiplier;                                      //乘数变量
        int multiplicand;                                    //被乘数变量
        for(int out = 0; out <9; out++){
            multiplier = out + 1;
            for(int in = 0; in < multiplier; in++){
                if(in == 0){
                    System.out.print("1 * " + multiplier + " = " + multiplier + "\t");
                } else {
                    multiplicand = in + 1;
                    System.out.print(multiplicand + " * " + multiplier + " = " + (multiplicand * multiplier) + "\t");
                }
            }
            System.out.println();
        }
    }
}

//int number[][] = new int[9][];                数组形式的
//  number[out] = new int[out + 1];             //创建比外层多一个元素的数组
//for(int in = 0; in < number[out].length; in++){