package com.heiha.unknown.learning.guava;

import com.google.common.net.InternetDomainName;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/8 9:55<br>
 * <b>Author:</b> heiha<br>
 */
public class InternetDomainNameSample {

    /**
     * Using test of {@link InternetDomainName#isValid(String)} <br>
     * 1. parameter String name can not be null. <br>
     */
    public void isValid() {
        List<String> domains = new ArrayList<>();
        domains.add("");
//        domains.add(null);
        domains.add("www.");
        domains.add("www.ss.cn");
        domains.add("www.dd");
        domains.add("www");
        domains.add("ww");
        domains.add("ww.dd");
        domains.add("dd.dd");
        domains.add("www:dd");
        domains.add("www.dd:80");
        domains.add("1.1.1.1");
        domains.add("www.1.1.1.c");
        for (String domain: domains) {
            System.out.println(domain + " is " + InternetDomainName.isValid(domain));
        }
    }

}
