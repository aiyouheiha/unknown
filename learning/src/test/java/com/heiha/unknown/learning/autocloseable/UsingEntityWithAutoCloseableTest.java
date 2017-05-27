package com.heiha.unknown.learning.autocloseable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/27 14:58<br>
 * <b>Author:</b> heiha<br>
 */
public class UsingEntityWithAutoCloseableTest {
    private UsingEntityWithAutoCloseable using;

    @Before
    public void setUp() throws Exception {
        using = new UsingEntityWithAutoCloseable();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testUse() throws Exception {
        using.use();
    }
}