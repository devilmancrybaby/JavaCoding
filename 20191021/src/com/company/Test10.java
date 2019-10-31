package com.company;

public class Test10 {
    public static void main(String[] args) {
        int[][] myScores=new int[][]{{76,78,96,75},{65,74,86,24},{56,76,98,87}};
        for(int[] a:myScores){
            for(int b:a){

                if(b<60){
                    break;
                }else {
                    System.out.println(b);
                }
            }
        }
    }
}
