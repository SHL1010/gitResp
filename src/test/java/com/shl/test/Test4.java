package com.shl.test;

import com.shl.bean.Book;
import com.shl.bean.Cat;
import com.shl.bean.Mouse;
import com.shl.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Auther: shl
 * @Date: 2021/5/17 - 05 - 17 - 10:46 下午
 * @Description: com.shl.test
 * @version: 1.0
 */
public class Test4 {


    @Test
    public void testGetBean() {

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Student student1 = applicationContext.getBean("student1", Student.class);
        System.out.println(student1.getBookList()+"  List集合注入");
        System.out.println();
        System.out.println(student1.getBookList2()+" List对象集合注入");
        System.out.println();
        System.out.println(student1.getBookMap()+"  Map集合注入");
        System.out.println();
        System.out.println(Arrays.toString(student1.getBooks())+"  数组注入");
        System.out.println();
        System.out.println(student1.getBookSet()+"  Set集合注入");






    }


}
