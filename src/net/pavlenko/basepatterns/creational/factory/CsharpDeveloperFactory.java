package net.pavlenko.basepatterns.creational.factory;

public class CsharpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CsharpDeveloper();
    }
}
