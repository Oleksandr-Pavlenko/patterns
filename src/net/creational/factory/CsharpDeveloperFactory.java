package net.creational.factory;

public class CsharpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CsharpDeveloper();
    }
}
