package com.shl.bean;

import java.util.Date;

/**
 * @Auther: shl
 * @Date: 2021/5/18 - 05 - 18 - 11:51 下午
 * @Description: com.shl.bean
 * @version: 1.0
 */
public class Mouse {

    private String name;
    private Date birthday;

    public Mouse() {
    }

    public Mouse(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
