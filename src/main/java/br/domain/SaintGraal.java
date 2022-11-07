package br.domain;

public class SaintGraal {

    public SaintGraal() {
        System.out.println(getClass().getSimpleName() + " criado");
    }

    public boolean isSaint() {
        System.out.println("verificando o Santo Graal: eh Santo");
        return true;
    }
}
