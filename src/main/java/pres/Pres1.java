package pres;

import dao.DaoImpl;
import dao.IDao;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        MetierImpl metier=new MetierImpl();//instanciation statique
        DaoImpl2 dao =new DaoImpl2();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
