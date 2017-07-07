package com.heiha.unknown.learning.test;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/7 15:33<br>
 * <b>Author:</b> heiha<br>
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            test();
        } catch (Throwable t) {
            System.out.println("get");
        }
    }

    public static void test() {
        throw new RuntimeException("test");
    }
}
