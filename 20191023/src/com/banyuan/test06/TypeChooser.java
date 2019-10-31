package com.banyuan.test06;

public class TypeChooser {
    public static ImageSaver getSaver(String type){
        if(type.equalsIgnoreCase("GIF")){
            return new GifSaver();
        }else if(type.equalsIgnoreCase("JPG")){
            return new JpgSaver();
        }else if(type.equalsIgnoreCase("PNG")){
            return new PngSaver();
        }else{
            return  null;
        }
    }
}
