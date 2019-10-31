package com.banyuan.test03;

import com.banyuan.test04.Query;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Score s1=new Score(92,98,86,90);
        Student st1=new Student(1,"小明",s1);
        Score s2=new Score(99,90,82,95);
        Student st2=new Student(2,"小明",s2);
        Score s3=new Score(97,89,84,97);
        Student st3=new Student(3,"小明",s3);
        Score s4=new Score(91,90,90,92);
        Student st4=new Student(4,"小明",s4);
        Score s5=new Score(92,87,88,100);
        Student st5=new Student(5,"小明",s5);

        List list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println(list.get(2));

    }

}
