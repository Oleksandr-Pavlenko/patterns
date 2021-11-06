package net.pavlenko.basepatterns.creational.abstractfactory.website;

import net.pavlenko.basepatterns.creational.abstractfactory.ProjectManger;

public class WebsitePM implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
    }
}
