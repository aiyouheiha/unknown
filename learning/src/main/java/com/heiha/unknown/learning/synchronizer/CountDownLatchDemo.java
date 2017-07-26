package com.heiha.unknown.learning.synchronizer;

import java.util.concurrent.CountDownLatch;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/26 15:44<br>
 * <b>Author:</b> heiha<br>
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(new DoSomething(5, countDownLatch)).start();
        new Thread(new DoSomething(10, countDownLatch)).start();
        new Thread(new DoSomething(15, countDownLatch)).start();
        countDownLatch.await();
        System.out.println("end");
    }
}
