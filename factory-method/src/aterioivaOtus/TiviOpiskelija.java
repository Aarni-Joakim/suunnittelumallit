package aterioivaOtus;

import juoma.Juoma;
import juoma.Samppanja;
import ruoka.Pyttipannu;
import ruoka.Ruoka;

public class TiviOpiskelija extends AterioivaOtus{

    public Juoma createJuoma() { return new Samppanja(); }

    public Ruoka createRuoka() { return new Pyttipannu(); }

}