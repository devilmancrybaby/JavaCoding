package com.banyuan.coding;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author huangmingyang
 */
public class Test08 {
    public static void main(String[] args) {
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("b"));
            Person08 p=new Person08();
            p.setName("zhangsan");
            p.setAge(22);
            oos.writeObject(p);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(oos!=null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
