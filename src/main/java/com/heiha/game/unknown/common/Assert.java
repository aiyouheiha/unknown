package com.heiha.game.unknown.common;

import java.util.regex.Pattern;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/23 16:44<br>
 * <b>Author:</b> heiha<br>
 */
public class Assert {
    private final static Pattern DOMAIN_PATTERN =
            Pattern.compile("^[0-9a-zA-Z]+[0-9a-zA-Z\\.-]*\\.[a-zA-Z]{2,4}$");

    public static void isDomain(String domain) {
        if (!DOMAIN_PATTERN.matcher(domain).matches()) {
            throw new IllegalArgumentException("”Ú√˚∏Ò Ω¥ÌŒÛ");
        }
    }

    public static void main(String[] args) {
        Assert.isDomain("www...");
    }
}
