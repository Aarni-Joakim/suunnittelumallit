package bossTehdas;

import abstractFactory.AbstraktiVaateTehdas;
import vaatekappaleet.Farmarit;
import vaatekappaleet.Kengat;
import vaatekappaleet.Lippis;
import vaatekappaleet.Tpaita;

public class BossTehdas implements AbstraktiVaateTehdas {

    public Object[] getVaatetus(){
        return new Object[] {
                createFarmarit(),
                createKengat(),
                createLippis(),
                createTpaita()};
    }

    @Override
    public Farmarit createFarmarit() {
        return new Coolmax();
    }

    @Override
    public Kengat createKengat() {
        return new Saturn();
    }

    @Override
    public Lippis createLippis() {
        return new Fresco();
    }

    @Override
    public Tpaita createTpaita() {
        return new Merino();
    }
}
