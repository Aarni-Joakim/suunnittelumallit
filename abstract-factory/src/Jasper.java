
import abstractFactory.AbstraktiVaateTehdas;
import adidasTehdas.AdidasTehdas;
import bossTehdas.BossTehdas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Jasper {

    private final Object[] vaatetus;

    public Jasper (OpiskelijaStatus oStatus) {
        AbstraktiVaateTehdas tehdas = getFactory(oStatus);
        vaatetus = tehdas.getVaatetus();
    }

    public void tarkistaVaatetus() {

        for (Object vaatekappale : vaatetus) {
            if (vaatekappale != null) System.out.println(vaatekappale);
        }
    }

    public AbstraktiVaateTehdas getFactory(OpiskelijaStatus oStatus) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("tehdas.properties"));
        } catch (IOException e) { e.printStackTrace(); }
        try {
            Class cl = Class.forName(properties.getProperty(oStatus.toString()));
            return (AbstraktiVaateTehdas) cl.getDeclaredConstructor().newInstance();
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }
}
