package com.banyuan.test01;

import java.io.*;

public class IOTest06 {
    public static void main(String[] args) {
        File src=new File("a.txt");
        File src2=new File("123.txt");
        Reader rd=null;
        Writer wt=null;
        try {
            rd=new FileReader(src);
            wt=new FileWriter(src2);
            int length=-1;
            char []c=new char[1024];
            while((length=rd.read(c))!=-1){
                wt.write(c,0,length);
            }
            wt.append("aaaaaa");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(wt!=null){
                try {
                    wt.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (rd!=null){
                try {
                    rd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
