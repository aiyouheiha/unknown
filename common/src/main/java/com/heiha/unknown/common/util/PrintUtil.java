package com.heiha.unknown.common.util;

import com.alibaba.fastjson.JSON;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/27 17:23<br>
 * <b>Author:</b> heiha<br>
 */
public class PrintUtil {
    public static void printJsonString(Object object) {
        System.out.println(JSON.toJSONString(object));
    }
}
