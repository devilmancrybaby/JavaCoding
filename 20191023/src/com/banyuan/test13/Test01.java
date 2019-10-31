package com.banyuan.test13;

import java.util.TreeSet;

public class Test01 {

    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();

        ts.add(22);
        ts.add(11);
        ts.add(44);
        ts.add(32);
        ts.add(52);
        ts.add(35);
        for (Integer i:ts){
            System.out.println(i);
        }
    }
}
