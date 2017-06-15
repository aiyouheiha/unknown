package com.heiha.unknown.test;

import com.alibaba.fastjson.JSONObject;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/8 18:06<br>
 * <b>Author:</b> heiha<br>
 *
 *
 */
public class TestPriority {
    public static void main(String[] args) {
        test1();
    }

    /**
     * && priority higher than || <br>
     * 不过没括号，讲道理不是什么好习惯……
     */
    public static void test1() {
        Boolean b1 = true;
        Boolean b2 = true;
        Boolean b3 = true;
        Boolean b4 = false;
        if (b1 && b2 || b3 && b4) {
            System.out.println("xxx");
        }
    }
}
