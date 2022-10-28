package com.demo.factory;

/**
 * 汽车抽象类
 * @author max
 */
public abstract class Car {
    protected String name;

    public void drive() {
        System.out.println(this.name+" is driving");
    }
}
