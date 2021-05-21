package com.shl.test;

import com.shl.bean.Book;
import com.shl.bean.BookFactory;
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
public class Test5 {


    @Test
    public void testGetBean() {

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationContext5.xml");

        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);


    }


}
