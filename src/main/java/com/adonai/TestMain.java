package com.adonai;

import com.adonai.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String []args){
        ApplicationContext beans =  new ClassPathXmlApplicationContext("classpath:application-customtag.xml");
        User user = (User) beans.getBean("testBean");
        System.out.println(user.toString());
    }

}
