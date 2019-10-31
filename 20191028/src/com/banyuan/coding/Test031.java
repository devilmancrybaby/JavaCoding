package com.banyuan.coding;

public class Test031 {
    public static void main(String[] args) {
        Test03 stu=null;

        stu=new Test03("MLDN-33","李四",95.f,89.0f,96.0f);
        System.out.println("学生编号: "+stu.getStuNo());
        System.out.println("学生姓名: "+stu.getName());
        System.out.println("数学成绩: "+stu.getMath());
        System.out.println("英语成绩: "+stu.getEnglish());
        System.out.println("计算机成绩: "+stu.getComputer());
        System.out.println("最高分： "+stu.max());
        System.out.println("最低分： "+stu.min());
    }
}
