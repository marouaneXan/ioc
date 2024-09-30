package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

    //depend a des interface (couplage faible)
    private IDao dao;
    @Override
    public double calcul() {
        double data=dao.getData();
        return data * 10;
    }

    public IDao getDao() {
        return dao;
    }

    //pour injecter une valeur a la variable dao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
