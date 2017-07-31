package com.heiha.unknown.learning.synchronizer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/31 18:06<br>
 * <b>Author:</b> heiha<br>
 */
public class ReentrantLockDemo {
    // lock for class, without static then lock for object
    private final static ReentrantLock LOCK = new ReentrantLock();

    public void print() {
        try {
            LOCK.lock();
            Thread.sleep(5000);
            System.out.println("********");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            LOCK.unlock();
        }
    }

    public static void main(String[] args) {
        int i = 10;
        while (i-- > 0) {
            new Thread(() -> {
                ReentrantLockDemo demo = new ReentrantLockDemo();
                demo.print();
            }).start();
        }
    }
}
