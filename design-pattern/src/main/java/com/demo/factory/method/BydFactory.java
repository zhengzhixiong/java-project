package com.demo.factory.method;

import com.demo.factory.Car;
import com.demo.factory.simple.BydCar;

/**
 * 比亚迪 汽车工厂
 * @author max
 */
public class BydFactory extends CarAbstractFactory {
    @Override
    Car createCar() {
        return new BydCar();
    }
}
