package com.banyuan.test01;

import java.io.*;
//文件拷贝
public class IOTest04 {
    public static void main(String[] args) {
        copy("a","d");
    }
        public static void copy(String aPath,String bPath){
        File src=new File(aPath);
        File dest=new File(bPath);
        InputStream is=null;
        OutputStream os=null;
        try {
            is=new FileInputStream(src);
            os=new FileOutputStream(dest);
            int length=-1;
            byte[] bt=new byte[1024];
            while((length=is.read(bt))!=-1){
                os.write(bt,0,length);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } }
            }
        }
    }

