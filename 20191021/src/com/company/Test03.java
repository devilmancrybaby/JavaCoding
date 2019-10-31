package com.company;

public class Test03 {
    public static void main(String[] args) {
        int number = 0;
        int temp = 0;
        for (number = 0; number < 100; number++) {
            if (number % 2 == 0) {
                temp += number;
            }
        }
        System.out.println(temp);
    }
}
