package net.pavlenko.basepatterns.structural.composite;

public class Project {
    public static void main(String[] args) {

        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer csharpDeveloper = new CsharpDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(csharpDeveloper);

        team.createProject();

    }
}
