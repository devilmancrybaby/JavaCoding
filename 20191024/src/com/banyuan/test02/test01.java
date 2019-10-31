package com.banyuan.test02;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

public class test01 {
    public static void main(String[] args) {
        try {
            LinkedList list = new LinkedList();
            BufferedReader br = new BufferedReader(new FileReader("123.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                list.add(s);
                System.out.println(s);
            }
//            for (int i=list.size();i<list.size();i--) {
//                System.out.println(list.get(i));
//            }
            Iterator iterator=list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
