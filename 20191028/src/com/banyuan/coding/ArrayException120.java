package com.banyuan.coding;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author huangmingyang
 * 数组越界抛出异常
 */
public class ArrayException120 {
    public static void main(String[] args) {
        int[] array=new int[5];
        Arrays.fill(array,8);
        for (int i=0;i<6;i++){
            System.out.println("array["+i+"]="+array[i]);
        }
    }
}
