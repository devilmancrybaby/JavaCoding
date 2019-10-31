package com.banyuan.test06;

public class PngSaver implements ImageSaver {
    @Override
    public void save() {
        System.out.println("将图片保存为png格式！");
    }
}
