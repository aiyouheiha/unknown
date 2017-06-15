package com.heiha.unknown.learning.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heiha.unknown.learning.pojo.User;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/14 15:48<br>
 * <b>Author:</b> heiha<br>
 */
public class UsingJackson {
    public static void main(String[] args) throws JsonProcessingException {
        User user = new User();
        user.setAge(10);
        user.setIsMaster(true);
        user.setUserName("abc");


    }


}
