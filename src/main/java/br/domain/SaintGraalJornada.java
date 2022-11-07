package br.domain;

public class SaintGraalJornada implements Jornada{

    private Graal graal;

    public SaintGraalJornada(Graal graal) {
        System.out.println(getClass().getSimpleName() + " criado");
        this.graal = graal;
    }

    public Graal embarque() throws GraalNotFoundException {

        System.out.println("encontrando Santo Graal");
        return graal;
    }
}
