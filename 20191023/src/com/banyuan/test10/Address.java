package com.banyuan.test10;

public class Address {
    private String country;
    private String province;
    private String city;

    public Address(String country, String province, String city) {
        this.country = country;
        this.province = province;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("国家: "+country+",");
        sb.append("省份: "+province+",");
        sb.append("城市: "+city);
        return sb.toString();
    }
}
