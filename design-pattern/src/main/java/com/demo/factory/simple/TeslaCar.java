package com.demo.factory.simple;

import com.demo.factory.Car;

/**
 * 特斯拉汽车
 * @author max
 */
public class TeslaCar extends Car {
    public TeslaCar() {
        this.name = "tesla";
    }
    public TeslaCar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TeslaCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
