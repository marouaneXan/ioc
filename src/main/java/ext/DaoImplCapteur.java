package ext;

import dao.IDao;

public class DaoImplCapteur implements IDao {
    @Override
    public double getData() {
        System.out.println("La version du capteur");
        double data=99;
        return data;
    }
}
