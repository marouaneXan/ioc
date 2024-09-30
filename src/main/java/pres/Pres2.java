package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        //MetierImpl metier=new MetierImpl();//instanciation statique
        //DaoImpl2 dao =new DaoImpl2();
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
        IDao dao =(IDao) cdao.getConstructor().newInstance(); // => new DaoImpl()
        //metier.setDao(dao);
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();
        Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);//injection de dependance
        System.out.println(metier.calcul());
    }
}
