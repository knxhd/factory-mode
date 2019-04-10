package com.mikasa.SimpleFactoryMode;

import org.junit.Test;

/**
 * @ClassName SimpleFacotroryModeTest
 * @description
 * @author: tianluhua
 * @date 2019/4/10 12:29
 */
public class SimpleFacotroryModeTest {

    /**
     * 传统模式
     */
    @Test
    public void test1() {
        Apple apple = new Apple();
        apple.get();
        Banana banana = new Banana();
        banana.get();
    }

    /**
     * 简单工厂模式，通过实现接口来创建其他类
     */
    @Test
    public void test2() {
        Fruit apple = new Apple();
        apple.get();
        Fruit banana = new Banana();
        banana.get();
    }

    /**
     * 简单工厂模式，用FruitFactory工厂将所有实例的创建放到这里，创建的是所有对象的父类
     */
    public void test3() {
        Fruit apple = FruitFactory.getApple();
        apple.get();
        Fruit banana = FruitFactory.getBanana();
        banana.get();
    }

    @Test
    public void test4() throws InstantiationException, IllegalAccessException {
        Fruit apple = FruitFactory1.getFruit("Apple");
        if (apple != null) {
            apple.get();
        }
    }

}
