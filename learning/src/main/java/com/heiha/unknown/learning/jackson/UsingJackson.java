package com.heiha.unknown.learning.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heiha.unknown.learning.pojo.User;

import java.io.IOException;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/14 15:48<br>
 * <b>Author:</b> heiha<br>
 */
public class UsingJackson {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setAge(10);
        user.setIsMaster(true);
        user.setUserName("abc");

        ObjectMapper mapper = new ObjectMapper();

        String userStr = mapper.writeValueAsString(user);
        System.out.println(userStr);
        User userTrans = mapper.readValue(userStr, User.class);
        System.out.println(userTrans.getAge());
        System.out.println(userTrans.getIsMaster());
        System.out.println(userTrans.getUserName());
    }


}
