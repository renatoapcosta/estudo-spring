package br.main;

import br.domain.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("classpath:tavola-redonda.xml");
        Cavaleiro cavaleiro1 = (Cavaleiro) applicationContext.getBean("cavaleiro");
        Graal saintGraal1 = cavaleiro1.embarqueNaJornada();
        saintGraal1.isSaint();

        System.out.println("-------------------------------------------------");
        Cavaleiro cavaleiro2 = applicationContext.getBean(Cavaleiro.class);
        Graal saintGraal2 = cavaleiro2.embarqueNaJornada();
        saintGraal2.isSaint();
        System.out.println("-------------------------------------------------");

    }
}
