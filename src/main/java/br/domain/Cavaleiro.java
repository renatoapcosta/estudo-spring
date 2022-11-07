package br.domain;

public class Cavaleiro {

    private String nome;
    private SaintGraalJornada jornada;

    public Cavaleiro(String nome) {
        System.out.println(getClass().getSimpleName() + " criado");
        this.nome = nome;
        this.jornada = new SaintGraalJornada();
        System.out.println("Cavaleiro recebe uma jornada");
    }

    public SaintGraal embarqueNaJornada() {
        System.out.println("embarque na jornada !!");
        return jornada.embarque();
    }
}
