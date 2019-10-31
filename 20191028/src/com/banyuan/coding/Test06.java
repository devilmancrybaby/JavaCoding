package com.banyuan.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * @author huangmingyang
 */
public class Test06 {
    public static void main(String[] args) {
        String line = null;
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("请输入：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i=0;
            do {
                line = br.readLine();
                al.add(line);
            } while (i++<3);
            for(int j=0;j<al.size();j++) {
                System.out.println(al.get(j));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
