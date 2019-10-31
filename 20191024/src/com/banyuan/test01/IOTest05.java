package com.banyuan.test01;

import java.io.*;
//字符流
public class IOTest05 {
    public static void main(String[] args) {
        File src=new File("a.txt");
        try {
            Reader rd=new FileReader(src);
            char[] chars=new char[2];
            int length=-1;
            while((length=rd.read(chars))!=-1){
                String str=new String(chars,0,length);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
