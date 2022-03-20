package aterioivaOtus;

import juoma.Juoma;
import juoma.Energiajuoma;
import ruoka.Kalapuikko;
import ruoka.Ruoka;

public class Alaastelainen extends AterioivaOtus{

    public Juoma createJuoma() { return new Energiajuoma(); }

    public Ruoka createRuoka() { return new Kalapuikko(); }

}
