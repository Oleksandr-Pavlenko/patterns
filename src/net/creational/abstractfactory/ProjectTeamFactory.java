package net.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManger getProjectManager();
}
