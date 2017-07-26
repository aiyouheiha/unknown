package com.heiha.unknown.learning.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/26 16:13<br>
 * <b>Author:</b> heiha<br>
 */
public class ShowDiffThread implements Runnable {
    private Integer waitSec1;
    private Integer waitSec2;
    private CountDownLatch latch;

    public ShowDiffThread(Integer waitSec1, Integer waitSec2, CountDownLatch latch) {
        this.waitSec1 = waitSec1;
        this.waitSec2 = waitSec2;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName().concat(" step1 start"));
            doSomething(waitSec1);
        } finally {
            if (latch != null) {
                latch.countDown();
            }
            System.out.println(Thread.currentThread().getName().concat(" step1 end"));
        }
        System.out.println(Thread.currentThread().getName().concat(" step2 start"));
        doSomething(waitSec2);
        System.out.println(Thread.currentThread().getName().concat(" step2 end"));
    }

    private void doSomething(Integer waitSec) {
        try {
            Thread.sleep(waitSec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
