package com.heiha.unknown.test;

import com.alibaba.fastjson.JSONObject;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/7 14:34<br>
 * <b>Author:</b> heiha<br>
 *
 *
 * 两个对象，相同字段名的Boolean和Integer字段，通过JSONObject可以自动互相转换 <br>
 * true - 1 <br>
 * false - 0
 */
public class TestJsonTransfer {
    public static void main(String[] args) {
        toTestClass2();
        toTestClass1();
    }

    public static void toTestClass2() {
        TestClass1 testClass1 = new TestClass1();
        testClass1.setTest(false);
        JSONObject testClass2Temp = JSONObject.parseObject(JSONObject.toJSONString(testClass1));
        TestClass2 testClass2 = JSONObject.parseObject(testClass2Temp.toJSONString(), TestClass2.class);
        System.out.println(testClass2.getTest());
    }

    public static void toTestClass1() {
        TestClass2 testClass2 = new TestClass2();
        testClass2.setTest(1);
        JSONObject testClass1Temp = JSONObject.parseObject(JSONObject.toJSONString(testClass2));
        TestClass1 testClass1 = JSONObject.parseObject(testClass1Temp.toJSONString(), TestClass1.class);
        System.out.println(testClass1.getTest());
    }
}

class TestClass1 {
    private Boolean test;

    public Boolean getTest() {
        return test;
    }

    public void setTest(Boolean test) {
        this.test = test;
    }
}

class TestClass2 {
    private Integer test;

    public Integer getTest() {
        return test;
    }

    public void setTest(Integer test) {
        this.test = test;
    }
}