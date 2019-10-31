package com.banyuan.test04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Query {
    public static void query(String id) {
        Student s1 = new Student("200101", "小明", 92, 98, 85, 90, 91);
        Student s2 = new Student("200102", "小红", 99, 90, 82, 95, 95);
        Student s3 = new Student("200103", "小刚", 97, 89, 84, 97, 98);
        Student s4 = new Student("200104", "小强", 91, 90, 90, 92, 91);
        Student s5 = new Student("200105", "小胖", 92, 87, 88, 100, 100);
        List<Student> ls = new ArrayList<Student>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
        ls.add(s5);
        Iterator it = ls.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            if (s.getId().equals(id)) {
                double sumScore = s.getChinese() + s.getPolitics() + s.getHistory() + s.getMath() + s.getEnglish();
                System.out.println("英语：" + s.getEnglish() + ",数学：" + s.getMath() + ",语文:" + s.getChinese() + "，历史：" + s.getHistory() + ",政治:" + s.getPolitics());
                System.out.println("总成绩：" + sumScore);

                double english = s.getEnglish();
                double math = s.getMath();
                double history = s.getHistory();
                double politics = s.getPolitics();
                double chinese = s.getChinese();
                double[] arr = {english, math, history, politics, chinese};
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 1; j < arr.length - i; j++) {
                        if (arr[i] - arr[i + 1] > 0) {//升序
                            double temp=0;
                            temp = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = temp;
                        }
                    }
                }
                System.out.println("最差成绩：" + arr[0] + "最优成绩：" + arr[4]);
            }
        }
    }
}