package br.domain;

public class SaintGraalJornada {

    public SaintGraalJornada() {
        System.out.println(getClass().getSimpleName() + " criado");
    }

    public SaintGraal embarque() throws GraalNotFoundException {
        SaintGraal saintGraal = new SaintGraal();
        System.out.println("encontrando Santo Graal");
        return saintGraal;
    }
}
