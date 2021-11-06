package net.pavlenko.basepatterns.creational.abstractfactory.banking;

import net.pavlenko.basepatterns.creational.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
