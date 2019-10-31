package com.banyuan.test06;

public class User {
    public static void main(String[] args) {
        System.out.println("用户选择了gif格式！");
        ImageSaver saver=TypeChooser.getSaver("gif");
        saver.save();
        System.out.println("用户选择了png格式！");
        saver=TypeChooser.getSaver("png");
        saver.save();
        System.out.println("用户选择了jpg格式！");
        saver=TypeChooser.getSaver("jpg");
        saver.save();
    }
}
