package br.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Cavaleiro {

   private String nome;

    @Autowired
    private Jornada jornada;

    public Cavaleiro( Jornada jornada) {
        System.out.println(getClass().getSimpleName() + " criado");
        this.nome = "Rei Arthur";
        this.jornada = jornada;
        System.out.println("Cavaleiro recebe uma jornada");
    }

    public Graal embarqueNaJornada() {
        System.out.println("embarque na jornada !!");
        return jornada.embarque();
    }
}
