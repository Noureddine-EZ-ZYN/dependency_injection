package net.noureddine.metier;

import net.noureddine.dao.IDao;

public class MetierImpl implements IMetier{

   public IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return Math.cos(23)* dao.getData();
    }
}
