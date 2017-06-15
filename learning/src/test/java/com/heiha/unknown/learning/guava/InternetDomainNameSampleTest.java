package com.heiha.unknown.learning.guava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/8 9:59<br>
 * <b>Author:</b> heiha<br>
 */
public class InternetDomainNameSampleTest {
    private InternetDomainNameSample sample;

    @Before
    public void setUp() throws Exception {
        sample = new InternetDomainNameSample();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testIsValid() throws Exception {
        sample.isValid();
    }
}