package com.heiha.unknown.learning.autocloseable;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/27 14:36<br>
 * <b>Author:</b> heiha<br>
 */
public class EntityWithAutoCloseable implements AutoCloseable {

    public void doSomething() {
        System.out.println("Doing something ...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Executing " + this.getClass().getSimpleName() + " close ...");
    }
}
