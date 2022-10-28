package com.demo.factory.simple;

import com.demo.factory.Car;

public class Test1 {
    public static void main(String[] args) {
        Car car = CarFactory.createCar("aito");
        System.out.println(car);
        car = CarFactory.createCar("byd");
        System.out.println(car);
        car = CarFactory.createCar("tesla");
        System.out.println(car);
        car = CarFactory.createCar("xiaopeng");
        System.out.println(car);
    }
}
