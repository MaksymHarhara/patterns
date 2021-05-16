package creational.abstractFactory.banking;

import creational.factory.Developer;

public class JavaDeveloper implements creational.abstractFactory.Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes code");
    }
}
