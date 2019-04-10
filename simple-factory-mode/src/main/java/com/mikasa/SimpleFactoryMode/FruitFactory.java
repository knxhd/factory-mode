package com.mikasa.SimpleFactoryMode;

/**
 * @ClassName FruitFactory
 * @description
 * @author: tianluhua
 * @date 2019/4/10 12:36
 */
class FruitFactory {

    static Fruit getApple() {
        return new Apple();
    }

    static Fruit getBanana() {
        return new Banana();
    }
}
