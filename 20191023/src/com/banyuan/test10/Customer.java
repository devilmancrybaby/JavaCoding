package com.banyuan.test10;

public class Customer implements Cloneable {
    private int id;
    private int age;
    private Address address;

    public Customer(int id, int age, Address address) {
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("编码: "+id+",");
        sb.append("年龄: "+age+",");
        sb.append("地址: "+address);
        return sb.toString();
    }
    public Customer clone() throws CloneNotSupportedException {
        Customer c= (Customer) super.clone();
       return c;
    }
}
