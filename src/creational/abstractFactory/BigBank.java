package creational.abstractFactory;

import creational.abstractFactory.banking.BankTeam;

public class BigBank {
    public static void main(String[] args) {
        TeamFactory teamFactory = new BankTeam();
        Developer developer = teamFactory.getDev();
        ProjectManager projectManager = teamFactory.getPM();
        QA qa = teamFactory.getQA();

        developer.writeCode();
        projectManager.manageProject();
        qa.manualTesting();
    }
}
