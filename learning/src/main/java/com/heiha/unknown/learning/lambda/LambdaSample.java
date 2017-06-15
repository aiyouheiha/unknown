package com.heiha.unknown.learning.lambda;

import javaslang.API;
import javaslang.Predicates;
import javaslang.control.Try;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/14 11:36<br>
 * <b>Author:</b> heiha<br>
 */
public class LambdaSample {

    public String handleString(final Throwable throwable) {
        return Try.of(() -> API.Match(throwable).of(
                API.Case(Predicates.instanceOf(NullPointerException.class), () -> message(throwable))
        )).getOrElseGet(s -> message(throwable));
    }

    private String message(Throwable throwable) {
        return throwable.getMessage();
    }

    public static void main(String[] args) {
        LambdaSample sample = new LambdaSample();
        System.out.println(sample.handleString(new NullPointerException("null pointer")));
        System.out.println(sample.handleString(new Exception("exception")));
    }
}

