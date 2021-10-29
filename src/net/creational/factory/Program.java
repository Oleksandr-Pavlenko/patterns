package net.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("c#");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpecialty (String specialty){
     if(specialty.equalsIgnoreCase("java")){
         return new JavaDeveloperFactory();
     }else if (specialty.equalsIgnoreCase("c#")){
         return new CsharpDeveloperFactory();
     }else {
         throw new RuntimeException(specialty + "is unknown specialty.");
     }
    }
}
