package com.banyuan.test01;

import java.io.*;
//通过byte分组 读取文件内容
public class IOTest02 {
    public static void main(String[] args) {
        File src=new File("a.txt");
        InputStream is=null;
        try {
            is=new FileInputStream(src);
            int temp=-1;
            byte[] bt=new byte[2];
            while ((temp=is.read(bt))!=-1){
                String str=new String(bt,0,temp);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
