package com.mikasa.SimpleFactoryMode;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName FruitFactory1
 * @description
 * @author: tianluhua
 * @date 2019/4/10 12:44
 */
@Slf4j
public class FruitFactory1 {

    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException {
        if ("Apple".equalsIgnoreCase(type)) {
            return Apple.class.newInstance();
        } else if ("Banana".equalsIgnoreCase(type)) {
            return Banana.class.newInstance();
        } else {
            log.info("没有找到该类型！");
            return null;
        }
    }

}
