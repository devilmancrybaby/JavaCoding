package com.banyuan.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("输入排序的值，输入的每个值用逗号隔开！");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(",");
        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println("排序前的数组：" + Arrays.toString(array));
        sort(array);
        System.out.println("排序后的数组：" + Arrays.toString(array));
    }

    private static void sort(int[] array) {
        int temp=0;
        int lastSwapIndex=0;
        int arrBoundary=array.length-1;
        for (int i=0;i<array.length;i++){
            System.out.println("第"+(i+1)+"趟");
            boolean flag=true;
            for (int j=0;j<arrBoundary;j++){
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=false;
                    lastSwapIndex=j;
                }
                System.out.println("第"+(j+1)+"次:"+Arrays.toString(array));
            }
            arrBoundary=lastSwapIndex;
            if (flag){
                break;
            }
        }

    }
}
