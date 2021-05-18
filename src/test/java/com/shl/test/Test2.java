package com.shl.test;

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
public class Test2 {


    @Test
    public void testGetBean() {

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        User user1 = applicationContext.getBean("user1", User.class);
        System.out.println(user1);


    }


}
