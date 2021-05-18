package com.shl.bean;

import java.util.Date;

/**
 * @Auther: shl
 * @Date: 2021/5/19 - 05 - 19 - 12:02 上午
 * @Description: com.shl.bean
 * @version: 1.0
 */
public class Cat {

    private String name;
    private Mouse mouse;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", mouse=" + mouse +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Cat() {
    }

    public Cat(String name, Mouse mouse) {
        this.name = name;
        this.mouse = mouse;
    }
}
