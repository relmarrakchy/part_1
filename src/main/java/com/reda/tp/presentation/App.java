package com.reda.tp.presentation;

import com.reda.tp.dao.IDao;
import com.reda.tp.metier.IMetier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        metier.calculate();
    }
}