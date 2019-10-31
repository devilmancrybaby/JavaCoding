package com.banyuan.coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.activation.MailcapCommandMap;

/**
 * @author huangmingyang
 */
public class Test09 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        Person09 p1=new Person09(1, "zhangsan", 100);
        Person09 p2=new Person09(1, "lisi", 99);
        hm.put(1, p1);
        hm.put(2, p2);

        Set keySet=hm.keySet();
        Iterator it=keySet.iterator();
        while(it.hasNext()) {
            Object key=it.next();
            System.out.println("key="+key);
            Object value=hm.get(key);
            System.out.println("value"+value);
        }

        System.out.println("==============");

        Set s=hm.entrySet();
        Iterator it2=s.iterator();
        while(it2.hasNext()) {
            Object obj2=it2.next();
            Map.Entry a=(Map.Entry)obj2;
//			System.out.println("0bj2="+obj2);
            Object key2=a.getKey();
            Object value2=a.getValue();
            System.out.println("key2="+key2);
            System.out.println("value2="+value2);
        }
    }
}
