package com.shl.bean;



import org.springframework.beans.factory.FactoryBean;

/**
 * @Auther: shl
 * @Date: 2021/5/21 - 05 - 21 - 10:06 下午
 * @Description: com.shl.bean
 * @version: 1.0
 */
public class BookFactory implements FactoryBean<Book> {


    public Book getObject() throws Exception {

        //先手动new出Book类
        Book book =new Book();
        book.setAuthor("SHL");
        book.setBname("逍遥游");

        return book;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
