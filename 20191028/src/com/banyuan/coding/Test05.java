package com.banyuan.coding;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author huangmingyang
 */
public class Test05 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("aaa"));
            bw.write("半圆学社");
            bw.newLine();
            bw.write("china");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bw != null)
                try {
                    bw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }
}
