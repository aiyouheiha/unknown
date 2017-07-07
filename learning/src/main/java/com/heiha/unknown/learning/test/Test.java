package com.heiha.unknown.learning.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/7/7 11:31<br>
 * <b>Author:</b> heiha<br>
 */
public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        List<Callable<String>> callableList = new ArrayList<>(100);
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 1; i< 50; i++) {
            final String iStr = String.valueOf(i);
            Callable<String> callable = new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(Integer.valueOf(iStr) * 1000);
                    return iStr;
                }
            };
            callableList.add(callable);
        }
        List<Future<String>> futures = executorService.invokeAll(callableList, 10, TimeUnit.SECONDS);
        for (Future future : futures) {
            System.out.println(future.get());
            if (!future.isDone()) {
                future.cancel(true);
            }
        }
    }
}
