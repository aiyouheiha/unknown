package com.heiha.unknown.learning.autocloseable;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/27 14:45<br>
 * <b>Author:</b> heiha<br>
 */
public class UsingEntityWithAutoCloseable {
    public void use() {
        try (
                // Objects which are auto closeable
                EntityWithAutoCloseable entity = new EntityWithAutoCloseable()
        ) {
            entity.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Doing something in finally ...");
        }
    }
}
