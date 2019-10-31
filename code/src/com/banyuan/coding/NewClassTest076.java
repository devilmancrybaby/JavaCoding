package com.banyuan.coding;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author huangmingyang
 */
public class NewClassTest076 {
    public static void main(String[] args) {
        try {
            Constructor<File> constructor=File.class.getDeclaredConstructor(String.class);
            System.out.println("使用反射创建file文件");
            File file=constructor.newInstance("./半圆学社.txt");
            System.out.println("创建半圆学社 文件");
            file.createNewFile();
            System.out.println("文件是否创建成功:"+file.exists());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
