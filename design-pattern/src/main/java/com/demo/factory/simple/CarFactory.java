package com.demo.factory.simple;

import com.demo.factory.Car;

/**
 * 汽车工厂
 * @author max
 */
public class CarFactory {
    /**
     *
     * @param carType 汽车类型，传入值：aito、byd、tesla
     * @return
     */
    public static Car createCar(String carType) {
        Car car = null;
        switch (carType) {
            case "aito":
                car = new AitoCar("aito");
                break;
            case "byd":
                car = new AitoCar("byd");
                break;
            case "tesla":
                car = new AitoCar("tesla");
                break;
            default:
        }

        return car;
    }
}
