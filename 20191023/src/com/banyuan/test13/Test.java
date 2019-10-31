package com.banyuan.test13;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        TreeSet<String> ts=new TreeSet<>();
        for (String data: Arrays.asList("B","E","D","C","A")){
            hashSet.add(data);
            lhs.add(data);
            ts.add(data);
        }
        System.out.println(hashSet);
        System.out.println(lhs);
        System.out.println(ts);

    }
}
