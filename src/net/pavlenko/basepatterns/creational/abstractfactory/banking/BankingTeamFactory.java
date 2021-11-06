package net.pavlenko.basepatterns.creational.abstractfactory.banking;

import net.pavlenko.basepatterns.creational.abstractfactory.Developer;
import net.pavlenko.basepatterns.creational.abstractfactory.ProjectManger;
import net.pavlenko.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import net.pavlenko.basepatterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper() {
        };
    }

    @Override
    public Tester getTester() {
        return new QATester() {
        };
    }

    @Override
    public ProjectManger getProjectManager() {
        return new BankingPM();
    }
}
