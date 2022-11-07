package br.domain;

import org.springframework.stereotype.Component;

@Component()
public class SaintGraal implements Graal {

    public SaintGraal() {
        System.out.println(getClass().getSimpleName() + " criado");
    }

    public boolean isSaint() {
        System.out.println("verificando o Santo Graal: eh Santo");
        return true;
    }
}
