package com.demo.factory.simple;

import com.demo.factory.Car;

/**
 * 比亚迪汽车
 * @author max
 */
public class BydCar extends Car {
    public BydCar() {
        this.name = "byd";
    }
    public BydCar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BydCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
