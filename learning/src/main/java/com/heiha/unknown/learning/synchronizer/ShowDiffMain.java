package com.heiha.unknown.learning.synchronizer;

import java.util.concurrent.CountDownLatch;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/26 16:19<br>
 * <b>Author:</b> heiha<br>
 *
 * {@link Thread#join()} only wait for thread work finish,
 * and {@link CountDownLatch} can wait for step 1 of thread work finish. <br>
 * <p>
 * What's more? When use Executor, get thread reference is hard or no way, CountDownLatch become a good choice. <br>
 * Obviously, the way {@link ThreadJoinDemo} using thread reference to start and join is ugly, that's not wise.
 *
 * <a href="http://blog.csdn.net/zhutulang/article/details/48504487">reference1</a><br>
 * <a href="http://developer.51cto.com/art/201403/432095.htm">reference2</a>
 */
public class ShowDiffMain {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        System.out.println("start");
        new Thread(new ShowDiffThread(5, 5, latch)).start();
        new Thread(new ShowDiffThread(10, 5, latch)).start();
        latch.await();
        System.out.println("step1 ok, thread3 start");
        new Thread(new ShowDiffThread(10, 10, null)).start();
        System.out.println("running");
    }
}
