package net.pavlenko.basepatterns.creational.singlton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
