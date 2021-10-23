package net.creational.abstractfactory;

import net.creational.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManger projectManger = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManger.manageProject();
    }
}
