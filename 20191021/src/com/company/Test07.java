package com.company;

public class Test07 {
    public static void main(String[] args) {
        double sum = 0;
        double Zi = 2.0, Mu = 1.0;
        for (int i = 0; i <= 20; i++) {
            sum += Zi / Mu;
            Mu = Zi;
            Zi = Zi + Mu;
        }
        System.out.println(sum);
    }
}
