package net.pavlenko.basepatterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();

        javaDeveloperJobSite.addVacancy("First Java Position");
        javaDeveloperJobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Oleksandr Pavlenko");
        Observer secondSubscriber = new Subscriber("Ivan Ivanov");

        javaDeveloperJobSite.addObserver(firstSubscriber);
        javaDeveloperJobSite.addObserver(secondSubscriber);

        javaDeveloperJobSite.addVacancy("Third Java Position");

        javaDeveloperJobSite.removeVacancy("First Java Position");
    }
}
