package com.banyuan.coding;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author huangmingyang
 */
public class Test07 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        String str = null;
        FileWriter fw1 = null;

        try {
            fw1 = new FileWriter("1-9");
            while (i++ < 10) {
                str = br.readLine();
                fw1.write(i + ". " + str + "\n");
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fw1 != null) {
                try {
                    fw1.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }finally {
                    try {
                        fw1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
