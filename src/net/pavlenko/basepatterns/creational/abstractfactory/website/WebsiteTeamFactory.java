package net.pavlenko.basepatterns.creational.abstractfactory.website;

import net.pavlenko.basepatterns.creational.abstractfactory.Developer;
import net.pavlenko.basepatterns.creational.abstractfactory.ProjectManger;
import net.pavlenko.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import net.pavlenko.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebsitePM();
    }
}
