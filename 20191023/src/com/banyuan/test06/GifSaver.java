package com.banyuan.test06;

public class GifSaver implements ImageSaver {
    @Override
    public void save() {
        System.out.println("将图片保存为GIF格式。");
    }
}
