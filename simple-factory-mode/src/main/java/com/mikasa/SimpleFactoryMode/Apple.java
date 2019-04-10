package com.mikasa.SimpleFactoryMode;

import lombok.Data;

/**
 * @ClassName Apple
 * @description
 * @author: tianluhua
 * @date 2019/4/10 12:22
 */
@Data
public class Apple implements Fruit{

    public void get(){
        System.out.println("采集苹果！");
    }

}
