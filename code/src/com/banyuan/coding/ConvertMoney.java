package com.banyuan.coding;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author huangmingyang
 */
public class ConvertMoney {
    private final static String[] STR_NUMBER = { "零", "壹", "贰", "叁", "肆", "伍",
            "陆", "柒", "捌", "玖" };
    private final static String[] STR_UNIT = { "", "拾", "佰", "仟", "万", "拾",
            "佰", "仟", "亿", "拾", "佰", "仟" };
    private final static String[] STR_UNIT2 = { "角", "分", "厘" };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个金额！");
        String convert = convert(sc.nextDouble());
        System.out.println(convert);
    }

    public static String convert(double d) {
        DecimalFormat df = new DecimalFormat("#0.###");
        String str = df.format(d);
        if (str.indexOf(".") != -1) {
            String num = str.substring(0, str.indexOf("."));
            if (num.length() > 12) {
                System.out.println("数字太大不能转换！");
                return "";
            }
        }
        String point = "";
        if (str.indexOf(".") != -1) {
            point = "元";
        } else {
            point = "元整";
        }
        String result = getInteger(str) + point + getDeciaml(str);
        if (result.startsWith("元")) {
            result = result.substring(1, result.length());
        }
        return result;

    }
    public static String numReplace(String num, String oldStr, String newStr) {
        while (true) {
            // 判断字符串中是否包含指定字符
            if (num.indexOf(oldStr) == -1) {
                break;
            }
            // 替换字符串
            num = num.replaceAll(oldStr, newStr);
        }
        // 返回替换后的字符串
        return num;
    }

    public static String getInteger(String num) {
        if (num.indexOf(".") != -1) {
            num = num.substring(0, num.indexOf("."));
        }
        num = new StringBuffer(num).reverse().toString();
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < num.length(); i++) {
            temp.append(STR_UNIT[i]);
            temp.append(STR_NUMBER[num.charAt(i) - 48]);
        }
        num = temp.reverse().toString();
        num = numReplace(num, "零拾", "零");
        num = numReplace(num, "零佰", "零");
        num = numReplace(num, "零千", "零");
        num = numReplace(num, "零万", "万");
        num = numReplace(num, "零亿", "亿");
        num = numReplace(num, "零零", "零");
        num = numReplace(num, "亿万", "亿");
        if (num.lastIndexOf("零") == num.length() - 1) {
            num = num.substring(0, num.length() - 1);
        }
        return num;
    }

    public static String getDeciaml(String num) {
        // 判断是否包含小数点
        if (num.indexOf(".") == -1) {
            return "";
        }
        num = num.substring(num.indexOf(".") + 1);
        // 反转字符串
        num = new StringBuffer(num).reverse().toString();
        // 创建一个StringBuffer对象
        StringBuffer temp = new StringBuffer();
        // 加入单位
        for (int i = 0; i < num.length(); i++) {
            temp.append(STR_UNIT2[i]);
            temp.append(STR_NUMBER[num.charAt(i) - 48]);
        }
        num = temp.reverse().toString(); // 替换字符串的字符
        num = numReplace(num, "零角", "零"); // 替换字符串的字符
        num = numReplace(num, "零分", "零"); // 替换字符串的字符
        num = numReplace(num, "零厘", "零"); // 替换字符串的字符
        num = numReplace(num, "零零", "零"); // 替换字符串的字符
        // 如果字符串以零结尾将其除去
        if (num.lastIndexOf("零") == num.length() - 1) {
            num = num.substring(0, num.length() - 1);
        }
        return num;
    }
}
