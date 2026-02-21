package net.noureddine.presentation;

import net.noureddine.metier.IMetier;
import net.noureddine.metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres3 {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring-ioc.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.print("rest"+metier.calcul());

    }

}
