package com.banyuan.coding;

import com.banyuan.test.Score;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author huangmingyang
 * 利用循环的方式实现二分法查找
 */
public class Test01 {
    public static void main(String[] args) {
        int[] array=sui();
        Arrays.sort(array);
        System.out.println("产生的随机数组为: "+Arrays.toString(array));
        System.out.println("你要查找的值");
        Scanner input=new Scanner(System.in);
        int aim=input.nextInt();

        int index=binarySearch(array,aim);
        System.out.println("查找索引值的位置"+index);
    }

    private static int[] sui(){
        int n=new Random().nextInt(6)+5;
        int[] array=new int[n];
        for (int i=0;i<array.length;i++){
            array[i]=new Random().nextInt(100);
        }
        return array;
    }

    private static int binarySearch(int[] array,int aim){
        int left=0;
        int right=array.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if (aim<array[mid]){
                right=mid-1;
            }else if (aim>array[mid]){
                left=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
