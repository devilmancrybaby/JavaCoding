package com.banyuan.test06;

public class JpgSaver implements ImageSaver {
    @Override
    public void save() {
        System.out.println("将图片保存为jpg格式！");
    }
}
