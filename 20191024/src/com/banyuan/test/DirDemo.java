package com.banyuan.test;

import java.io.File;

//目录创建，mkdir上级目录存在
//mkdirs上级目录可以不存在，如果不存在一同创建
public class DirDemo {
    public static void main(String[] args) {
//        File dir=new File("./java300/IO_study01/dir/test");
//        boolean flag=dir.mkdir();
//        System.out.println(flag);
//
//        boolean flag1=dir.mkdirs();
//        System.out.println(flag1);

        File dir=new File("./java300/IO_study01/dir/test2");
        boolean flag2=dir.mkdir();
        System.out.println(flag2);
    }
}
