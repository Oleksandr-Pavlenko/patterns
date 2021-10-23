package net.creational.abstractfactory.website;

import net.creational.abstractfactory.Developer;
import net.creational.abstractfactory.ProjectManger;
import net.creational.abstractfactory.ProjectTeamFactory;
import net.creational.abstractfactory.Tester;

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
