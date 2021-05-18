package com.shl.test;

import com.shl.bean.Cat;
import com.shl.bean.Mouse;
import com.shl.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: shl
 * @Date: 2021/5/17 - 05 - 17 - 10:46 下午
 * @Description: com.shl.test
 * @version: 1.0
 */
public class Test3 {


    @Test
    public void testGetBean() {

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Mouse mouse = applicationContext.getBean("mouse1", Mouse.class);
        System.out.println(mouse);

        Cat cat1 = applicationContext.getBean("cat1", Cat.class);
        System.out.println(cat1);


    }


}
