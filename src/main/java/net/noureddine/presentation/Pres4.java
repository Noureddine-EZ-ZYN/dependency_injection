package net.noureddine.presentation;

import net.noureddine.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pres4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.noureddine");
        IMetier metier =context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }

}
