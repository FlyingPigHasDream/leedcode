package com.leedcode.code;

import java.math.BigDecimal;

public class math27 {

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("0");

        b = b.add(new BigDecimal("1")).add(new BigDecimal("2"));

        System.out.println(b);
    }
}
