package net.noureddine.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version base de donnee");
      int  t=12;
        return t;
    }
}
