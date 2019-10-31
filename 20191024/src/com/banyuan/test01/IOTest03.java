package com.banyuan.test01;

import com.sun.tools.internal.ws.wsdl.document.Output;

import java.io.*;

public class IOTest03 {
    public static void main(String[] args) {
        File src=new File("a.txt");
        OutputStream os=null;
        try{
            os= new FileOutputStream(src,true);
            String str="io is so easy";
            byte[] bt=str.getBytes();
            os.write(bt,0,bt.length);
            os.flush();
            System.out.println("操作成功");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
