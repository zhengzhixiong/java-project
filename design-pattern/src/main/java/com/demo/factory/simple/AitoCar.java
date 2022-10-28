package com.demo.factory.simple;

import com.demo.factory.Car;

/**
 * 华为汽车 问界M5
 * @author max
 */
public class AitoCar extends Car {
    public AitoCar() {
        this.name = "aito";
    }
    public AitoCar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AitoCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
