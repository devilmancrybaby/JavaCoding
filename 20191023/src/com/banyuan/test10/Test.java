package com.banyuan.test10;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address=new Address("中国","江苏","南京");
        Customer ct=new Customer(1,3000,address);
        System.out.println(ct);
        Customer ct2=ct.clone();
        ct2.setAge(2000);
        ct2.getAddress().setCity("苏州");
        System.out.println(ct);
        System.out.println(ct2);
    }
}
