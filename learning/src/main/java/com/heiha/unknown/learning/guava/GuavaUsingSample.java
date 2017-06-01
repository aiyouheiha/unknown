package com.heiha.unknown.learning.guava;

import com.google.common.base.Optional;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/6/1 14:39<br>
 * <b>Author:</b> heiha<br>
 *
 *
 ����Optional.absent()�����һ��Optional�������ڲ������˿�ֵ
 ����Optional.fromNullable(T)����һ��T��ʵ��ת��ΪOptional����T��ʵ�����Բ�Ϊ�գ�Ҳ����Ϊ��[Optional.fromNullable(null)����Optional.absent()�ȼۡ�
 */
public class GuavaUsingSample {

    /**
     * Optional.of(T)�����һ��Optional�������ڲ�������һ����null��T��������ʵ������T=null�������̱���
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
