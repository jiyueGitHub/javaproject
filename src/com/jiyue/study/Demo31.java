package com.jiyue.study;

import javax.swing.*;
import java.math.BigDecimal;

public class Demo31 {
    public static void main(String[] args) {
        /**switch语句根据消费金额计算折扣
         * 实例说明：
         * 应用switch语句计算累计消费金额达到一定数额时，享受不同的折扣价格。
         *
         * 设计过程：
         * 在该类的主方法中实现本实例的业务代码，该方法首先假设一个用户消费总额的变量money
         * 并初始化一个折扣变量rebate，然后经过运算来获得用户等级
         * 对不同的等级给与不同的折扣优惠。
         *
         */
        float money = 1206F;
        float rebate = 0F;
        if(money > 200){
            int grade = (int)money / 200;
            switch(grade){
                case 1:
                    rebate = 0.95F;
                    break;
                case 2:
                    rebate = 0.90F;
                    break;
                default:
                    rebate = 0.60F;
            }

        }
        System.out.println("您的累计消费金额为：" + money);
        System.out.println("您将享受" + rebate + "折优惠");

























    }
}
