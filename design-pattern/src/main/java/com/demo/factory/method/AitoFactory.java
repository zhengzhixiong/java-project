package com.demo.factory.method;

import com.demo.factory.Car;
import com.demo.factory.simple.AitoCar;

/**
 * 华为Aito 汽车工厂
 * @author max
 */
public class AitoFactory extends CarAbstractFactory {
    @Override
    Car createCar() {
        return new AitoCar();
    }
}
