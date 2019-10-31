package com.banyuan.coding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author huangmingyang
 */
public class Test04 {
    public static void main(String[] args) {
        BufferedReader br = null;
        FileWriter fw = null;
        try {
            br = new BufferedReader(new FileReader("aaa"));
            fw = new FileWriter("cccc");
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                fw.write(line);
            }
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
