package org.acme.examples.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;

public class DroolsMain {

    public static void main(String... args) {
        KieSession session = KieServices.get()
                .getKieClasspathContainer()
                .getKieBase()
                .newKieSession();

        session.insert(new Person("Paul", 50));
        session.insert(new Person("Isabelle", 12));

        session.fireAllRules();

        session.getObjects(o -> o instanceof Adult)
                .forEach(System.out::println);
    }
}