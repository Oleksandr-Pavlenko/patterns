package net.pavlenko.basepatterns.creational.abstractfactory.banking;

import net.pavlenko.basepatterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
