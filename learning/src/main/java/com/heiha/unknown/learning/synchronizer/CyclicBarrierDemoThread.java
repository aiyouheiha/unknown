package com.heiha.unknown.learning.synchronizer;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/26 16:13<br>
 * <b>Author:</b> heiha<br>
 */
public class CyclicBarrierDemoThread implements Runnable {
    private Integer waitSec1;
    private Integer waitSec2;
    private CyclicBarrier barrier;

    public CyclicBarrierDemoThread(Integer waitSec1, Integer waitSec2, CyclicBarrier barrier) {
        this.waitSec1 = waitSec1;
        this.waitSec2 = waitSec2;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName().concat(" step1 start"));
            doSomething(waitSec1);
            System.out.println(Thread.currentThread().getName().concat(" step1 end"));
        } finally {
            if (barrier != null) {
                try {
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            System.out.println(Thread.currentThread().getName().concat(" step2 start"));
            doSomething(waitSec2);
            System.out.println(Thread.currentThread().getName().concat(" step2 end"));
        } finally {
            if (barrier != null) {
                try {
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(Thread.currentThread().getName().concat(" step2-2 start"));
        doSomething(waitSec2);
        System.out.println(Thread.currentThread().getName().concat(" step2-2 end"));

    }

    private void doSomething(Integer waitSec) {
        try {
            Thread.sleep(waitSec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
