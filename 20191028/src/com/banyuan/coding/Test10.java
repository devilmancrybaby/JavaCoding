package com.banyuan.coding;

/**
 * @author huangmingyang
 */
public class Test10 {
    public static void main(String[] args) {
        String str1="helloworld";
        String str2=str1.replace("hello","china" );
        System.out.println(str1);
        System.out.println(str2);

        String str3="qwe,asd,zxc";
        String []str4=str3.split(",");
        for(String a:str4) {
            System.out.println(a);
        }
        boolean flag1=str1.startsWith("h");
        boolean flag2=str1.endsWith("d");
        System.out.println(flag1);
        System.out.println(flag2);
        String str5=str1.toUpperCase();
        System.out.println(str5);

        String str6=str5.toLowerCase();
        System.out.println(str6);
    }

}
