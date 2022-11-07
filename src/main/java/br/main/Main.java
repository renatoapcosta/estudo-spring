package br.main;

import br.domain.Cavaleiro;
import br.domain.SaintGraal;

public class Main {

    public static void main(String[] args) {

        Cavaleiro cavaleiro1 = new Cavaleiro("Rei Arthur");
        SaintGraal saintGraal1 = cavaleiro1.embarqueNaJornada();
        saintGraal1.isSaint();

        System.out.println("-------------------------------------------------");
        Cavaleiro cavaleiro2 = new Cavaleiro("Rei Arthur");
        SaintGraal saintGraal2 = cavaleiro2.embarqueNaJornada();
        saintGraal2.isSaint();
        System.out.println("-------------------------------------------------");

    }
}
