package com.heiha.unknown.test;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/7 10:38<br>
 * <b>Author:</b> heiha<br>
 */
public class TestStringSplit {
    public static void main(String[] args) {
        String str1 = "10,13,16,17";
        String str2 = ",600,,900";
        String str3 = ",600,,900,";
        String str4 = ",600,,900,,";
        String[] splitStr1 = str1.split(",");
        String[] splitStr2 = str2.split(",");
        String[] splitStr3 = str3.split(",");
        String[] splitStr4 = str4.split(",");
        System.out.println(splitStr1.length);
        System.out.println(splitStr2.length);
        System.out.println(splitStr3.length);
        System.out.println(splitStr4.length);
    }
}
