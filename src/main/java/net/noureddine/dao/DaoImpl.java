package net.noureddine.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version base de donnee");
      int  t=12;
        return t;
    }
}
