package com.banyuan.coding;

import java.util.Arrays;

/**
 * @author huangmingyang
 * 自定义异常
 */
public class Exception1282 {
    public static void main(String[] args) {
        int[] array=new int[5];
        Arrays.fill(array,5);
        for (int i=4;i>-1;i--){
            if (i==0){
                throw new Exception1281("除零异常");
            }
            System.out.println("array["+i+"]/"+i+"="+array[i]/i);
        }
    }
}
