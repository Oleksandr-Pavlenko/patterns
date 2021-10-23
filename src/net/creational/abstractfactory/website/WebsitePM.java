package net.creational.abstractfactory.website;

import net.creational.abstractfactory.ProjectManger;

public class WebsitePM implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
    }
}
