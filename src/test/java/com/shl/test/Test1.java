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
public class Test1 {


    @Test
    public void testGetBean(){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

            User user1 = applicationContext.getBean("user1", User.class);
            System.out.println(user1);

//             使用set方法赋值
            User user2 = applicationContext.getBean("user2", User.class);
            System.out.println(user2+"  使用set方法赋值");

//            使用构造器传参
            User user3 = applicationContext.getBean("user3", User.class);
            System.out.println(user3+"  使用构造器传参");

//            使用 index 下标构造器传参
            User user4 = applicationContext.getBean("user4", User.class);
            System.out.println(user4+"  使用 index 下标构造器传参");

//            p 命名空间 是 property 标签的简写
            User user5 = applicationContext.getBean("user5", User.class);
            System.out.println(user5+"  p 命名空间");

//            c 命名空间 传参 是 constructor - arg 标签的简写
            User user6 = applicationContext.getBean("user6", User.class);
            System.out.println(user6+"  c 命名空间");


    }


}
