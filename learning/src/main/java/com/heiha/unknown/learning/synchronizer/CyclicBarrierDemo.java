package com.heiha.unknown.learning.synchronizer;

import java.util.concurrent.CyclicBarrier;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/26 17:14<br>
 * <b>Author:</b> heiha<br>
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("param thread, executed after every circle end");
            }
        });
        new Thread(new CyclicBarrierDemoThread(5, 10, barrier)).start();
        new Thread(new CyclicBarrierDemoThread(10, 5, barrier)).start();
        new Thread(new CyclicBarrierDemoThread(15, 10, barrier)).start();
        System.out.println("end");
    }
}
