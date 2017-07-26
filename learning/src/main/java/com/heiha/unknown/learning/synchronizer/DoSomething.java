package com.heiha.unknown.learning.synchronizer;

import java.util.concurrent.CountDownLatch;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/26 16:00<br>
 * <b>Author:</b> heiha<br>
 */
public class DoSomething implements Runnable {
    private Integer waitSec;
    private CountDownLatch countDownLatch;

    public DoSomething(Integer waitSec, CountDownLatch countDownLatch) {
        this.waitSec = waitSec;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            doSomething();
            System.out.println(Thread.currentThread().getName().concat(" will down"));
        } finally {
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            System.out.println(Thread.currentThread().getName().concat(" down"));
        }
    }

    private void doSomething() {
        try {
            Thread.sleep(waitSec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

