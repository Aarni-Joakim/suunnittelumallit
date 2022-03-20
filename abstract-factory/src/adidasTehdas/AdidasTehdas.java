package adidasTehdas;

import abstractFactory.AbstraktiVaateTehdas;
import vaatekappaleet.Farmarit;
import vaatekappaleet.Kengat;
import vaatekappaleet.Lippis;
import vaatekappaleet.Tpaita;

public class AdidasTehdas implements AbstraktiVaateTehdas {

    public Object[] getVaatetus(){
       return new Object[] {
               createFarmarit(),
               createKengat(),
               createLippis(),
               createTpaita()};
    }

    @Override
    public Farmarit createFarmarit() {
        return new OriginalsFarmarit();
    }

    @Override
    public Kengat createKengat() {
        return new Superstar();
    }

    @Override
    public Lippis createLippis() { return new GenericLippis(); }

    @Override
    public Tpaita createTpaita() {
        return new GenericTpaita();
    }
}
