package br.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class SaintGraalJornada implements Jornada{

    @Autowired
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
