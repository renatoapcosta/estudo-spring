package br.domain;

public class GraalNotFoundException extends RuntimeException{
    public GraalNotFoundException() {
        System.out.println(getClass().getSimpleName() + " criado");
    }
}
