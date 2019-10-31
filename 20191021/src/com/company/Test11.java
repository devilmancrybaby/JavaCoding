package com.company;
//while遍历自增数组
public class Test11 {
    public static void main(String[] args) {
        String[] array = new String[]{"白鹭", "黄鹂", "麻雀", "凤凰", "老鹰", "喜鹊", "老鹰","老斑鸠"};
        int length = 0;
        int count=0;
        System.out.println("鸟有：");
        for(String string:array){
            if(string.equals("老鹰")){
                count++;
                continue;
            }

            System.out.println(string);
        }
        System.out.println("出现了"+count+"老鹰！");
    }
}
