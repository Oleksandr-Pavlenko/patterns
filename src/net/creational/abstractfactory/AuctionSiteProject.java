package net.creational.abstractfactory;

import net.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManger projectManger = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction site");
        developer.writeCode();
        tester.testCode();
        projectManger.manageProject();
    }
}
