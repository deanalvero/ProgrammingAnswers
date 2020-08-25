package com.deanalvero.java.answers.codechef.practice.easy;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        try {
            int num;
            Scanner scanner = new Scanner(System.in);

            while (true) {
                num = scanner.nextInt();

                if (num == 42) {
                    break;
                }

                System.out.println(num);
            }
        } catch (Exception ignored) {

        }

        System.exit(0);
    }
}
