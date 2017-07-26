package com.heiha.unknown.learning.synchronizer;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/26 15:59<br>
 * <b>Author:</b> heiha<br>
 */
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new DoSomething(5, null));
        Thread t2 = new Thread(new DoSomething(10, null));
        Thread t3 = new Thread(new DoSomething(15, null));
        t1.start();
        t2.start();
        t3.start();
        System.out.println("all started");
        t3.join();
        t1.join();
        t2.join();
        System.out.println("end");
    }
}
