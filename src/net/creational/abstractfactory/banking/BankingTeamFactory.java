package net.creational.abstractfactory.banking;

import net.creational.abstractfactory.Developer;
import net.creational.abstractfactory.ProjectManger;
import net.creational.abstractfactory.ProjectTeamFactory;
import net.creational.abstractfactory.Tester;

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
