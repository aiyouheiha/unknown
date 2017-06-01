package com.heiha.unknown.learning.guava;

import com.google.common.base.Optional;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/1 14:39<br>
 * <b>Author:</b> heiha<br>
 *
 *
 　　Optional.absent()：获得一个Optional对象，其内部包含了空值
 　　Optional.fromNullable(T)：将一个T的实例转换为Optional对象，T的实例可以不为空，也可以为空[Optional.fromNullable(null)，和Optional.absent()等价。
 */
public class GuavaUsingSample {

    /**
     * Optional.of(T)：获得一个Optional对象，其内部包含了一个非null的T数据类型实例，若T=null，则立刻报错。
     */
    public void useOptionalOf(String testStr) {
        Optional<String> test = Optional.of(testStr);
        if (test.isPresent()) {
            System.out.println(test.get());
        }
    }

    public void useOptionalFromNullable(String testStr) {
        Optional<String> test = Optional.fromNullable(testStr);
        if (test.isPresent()) {
            System.out.println(test.get());
        } else {
            System.out.println("Giving String is null");
        }
    }
}
