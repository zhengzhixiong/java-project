package com.demo.factory.method;

import com.demo.factory.Car;
import com.demo.factory.simple.TeslaCar;

/**
 * 特斯拉 汽车工厂
 * @author max
 */
public class TeslaFactory extends CarAbstractFactory {
    @Override
    Car createCar() {
        return new TeslaCar();
    }
}
