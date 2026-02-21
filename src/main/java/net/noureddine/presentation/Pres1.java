package net.noureddine.presentation;

import net.noureddine.dao.DaoImpl;
import net.noureddine.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao =new DaoImpl();
        MetierImpl metier=new MetierImpl(dao);
       System.out.print("res:"+metier.calcul());
    }
}
