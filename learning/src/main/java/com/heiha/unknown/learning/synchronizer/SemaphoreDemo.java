package com.heiha.unknown.learning.synchronizer;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.concurrent.Semaphore;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/31 17:54<br>
 * <b>Author:</b> heiha<br>
 */
public class SemaphoreDemo implements Runnable {
    private Semaphore semaphore = new Semaphore(2);
    private String message;

    public SemaphoreDemo(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("********************<<<".concat(message));
            Thread.sleep(10000);
            System.out.println("********************>>>".concat(message));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        SemaphoreDemo demo = new SemaphoreDemo("www");
        int i = 10;
        while (i-- > 0) {
            new Thread(demo).start();
            new Thread(new SemaphoreDemo(String.valueOf(i))).start();
        }
    }
}
