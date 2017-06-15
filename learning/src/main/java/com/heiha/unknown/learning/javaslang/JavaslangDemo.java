package com.heiha.unknown.learning.javaslang;

import javaslang.control.Option;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/14 17:14<br>
 * <b>Author:</b> heiha<br>
 *
 */
public class JavaslangDemo {
    public void forOption() {
        String str1 = null;
        String str2 = "str2";
        Option<String> optionStr1 = Option.of(str1);
        Option<String> optionStr2 = Option.of(str2);

        // if null, use option.get() directly will get an exception
        System.out.println(optionStr1.getOrElse("Str1 is null"));
        System.out.println(optionStr2.getOrElse("Str2 is null"));
    }

    public static void main(String[] args) {
        JavaslangDemo demo = new JavaslangDemo();
        demo.forOption();
    }
}
