package com.banyuan.test07;

public class Test {
    public static void main(String[] args) {
        System.out.println("自定义普通的汽车：");
        Car car = new Car();
        car.setName("Adui");
        car.setSpeed(60);
        System.out.println(car);
        System.out.println("自定义GPS汽车：");
        GPSCar gpscar = new GPSCar();
        gpscar.setName("Adui");
        gpscar.setSpeed(60);
        System.out.println(gpscar);
    }
}
