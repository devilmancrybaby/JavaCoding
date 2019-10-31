package com.banyuan.coding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author huangmingyang
 * 文件未发现异常
 */
public class FileNotFound {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            File file=new File("./kira.txt");

            fis=new FileInputStream(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
