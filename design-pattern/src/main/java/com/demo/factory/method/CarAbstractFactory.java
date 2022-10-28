package com.demo.factory.method;

import com.demo.factory.Car;
import com.demo.factory.simple.AitoCar;

/**
 * 汽车工厂
 * @author max
 */
public abstract class CarAbstractFactory {
    /**
     * 定义创建汽车抽象方法
     * @return
     */
     abstract Car createCar();

    /**
     * 汽车试驾
     */
    protected void start() {
         createCar().drive();
     }
}
