package com.company;

public class Test05 {
    public static void main(String[] args) {
        int i, j, k;
        int sum = 0;
        for (int number = 100; number < 1000; number++) {
            i = number / 100;
            j = (number - i * 100) / 10;
            k = number - i * 100 - j * 10;
            sum = i * i * i + j * j * j + k * k * k;
            if (sum == number) {
                System.out.println("水仙花数: " + number);
            }

        }
    }
}
