package aterioivaOtus;

import juoma.Juoma;
import juoma.Punaviini;
import ruoka.Ruoka;
import ruoka.Viinikukko;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Punaviini();
    }

    public Ruoka createRuoka(){
        return new Viinikukko();
    }

}
