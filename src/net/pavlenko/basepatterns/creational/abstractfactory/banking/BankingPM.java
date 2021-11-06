package net.pavlenko.basepatterns.creational.abstractfactory.banking;

import net.pavlenko.basepatterns.creational.abstractfactory.ProjectManger;

public class BankingPM implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
