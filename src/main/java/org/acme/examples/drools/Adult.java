package org.acme.examples.drools;

public class Adult {

    final private Person person;

    public Adult(Person person) {
        this.person = person;
    }

    public Person person() {
        return person;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "person=" + person +
                '}';
    }
}
