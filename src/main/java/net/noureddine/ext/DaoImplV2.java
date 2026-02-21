package net.noureddine.ext;

import net.noureddine.dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.print("version capteurs");
        return 19;
    }
}
