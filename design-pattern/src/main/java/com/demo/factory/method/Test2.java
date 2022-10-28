package com.demo.factory.method;

public class Test2 {
    public static void main(String[] args) {
        CarAbstractFactory factory = null;
        // aito byd tesla
        String carType = "tesla";
        if (carType.equals("aito")) {
            factory = new AitoFactory();
        } else if (carType.equals("byd")) {
            factory = new BydFactory();
        } else if (carType.equals("tesla")) {
            factory = new TeslaFactory();
        } else {
            System.out.println("unknown factory");
            return;
        }
        // 开始试驾
        factory.start();
    }
}
