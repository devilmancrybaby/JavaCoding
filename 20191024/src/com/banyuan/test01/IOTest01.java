package com.banyuan.test01;

import java.io.*;

public class IOTest01 {
    public static void main(String[] args) {
        File src = new File("a");
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            int temp;
            while ((temp = is.read()) != -1) {
                System.out.println((char) temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
