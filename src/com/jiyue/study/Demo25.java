package com.jiyue.study;

import java.math.BigDecimal;

public class Demo25 {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal("2");
        BigDecimal rebate = new BigDecimal("1.5");
        BigDecimal result = money.divide(rebate,20,BigDecimal.ROUND_HALF_UP);
        System.out.println(result);
    }
}
