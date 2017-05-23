package com.heiha.game.unknown.start;

import java.util.Scanner;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/23 15:07<br>
 * <b>Author:</b> heiha<br>
 */
public class UnknownApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("new start");
                break;
            default:
                System.out.println("-");
                break;
        }
    }

    private static void welcome() {
        System.out.println("1. new start");
    }
}
