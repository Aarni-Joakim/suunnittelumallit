package abstractFactory;

import vaatekappaleet.Farmarit;
import vaatekappaleet.Kengat;
import vaatekappaleet.Lippis;
import vaatekappaleet.Tpaita;

public interface AbstraktiVaateTehdas {

    public Object[] getVaatetus();

    public abstract Farmarit createFarmarit();
    public abstract Kengat createKengat();
    public abstract Lippis createLippis();
    public abstract Tpaita createTpaita();
}
