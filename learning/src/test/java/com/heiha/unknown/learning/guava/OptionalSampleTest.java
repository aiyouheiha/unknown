package com.heiha.unknown.learning.guava;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/1 14:43<br>
 * <b>Author:</b> heiha<br>
 */
public class OptionalSampleTest {
    private OptionalSample sample;

    @Before
    public void setUp() throws Exception {
        sample = new OptionalSample();
    }

    @Test
    public void testUseOptionalOf() throws Exception {
        sample.useOptionalOf("123");
        sample.useOptionalOf(null);
    }

    @Test
    public void testUseOptionalFromNullable() throws Exception {
        sample.useOptionalFromNullable("123");
        sample.useOptionalFromNullable(null);
    }
}