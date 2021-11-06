package net.pavlenko.basepatterns.creational.abstractfactory.website;

import net.pavlenko.basepatterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
