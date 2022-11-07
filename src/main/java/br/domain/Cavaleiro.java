package br.domain;

public class Cavaleiro {

    private String nome;
    private Jornada jornada;

    public Cavaleiro(String nome, Jornada jornada) {
        System.out.println(getClass().getSimpleName() + " criado");
        this.nome = nome;
        this.jornada = jornada;
        System.out.println("Cavaleiro recebe uma jornada");
    }

    public Graal embarqueNaJornada() {
        System.out.println("embarque na jornada !!");
        return jornada.embarque();
    }
}
