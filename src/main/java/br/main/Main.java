package br.main;

import br.domain.*;

public class Main {

    public static void main(String[] args) {
        Graal graal1 = new SaintGraal();
        Jornada jornada1 = new SaintGraalJornada(graal1);
        Cavaleiro cavaleiro1 = new Cavaleiro("Rei Arthur", jornada1);
        Graal saintGraal1 = cavaleiro1.embarqueNaJornada();
        saintGraal1.isSaint();

        System.out.println("-------------------------------------------------");
        Graal graal2 = new SaintGraal();
        Jornada jornada2 = new SaintGraalJornada(graal2);
        Cavaleiro cavaleiro2 = new Cavaleiro("Rei Arthur", jornada2);
        Graal saintGraal2 = cavaleiro2.embarqueNaJornada();
        saintGraal2.isSaint();
        System.out.println("-------------------------------------------------");

    }
}
