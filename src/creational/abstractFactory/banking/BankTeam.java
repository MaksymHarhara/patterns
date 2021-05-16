package creational.abstractFactory.banking;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ProjectManager;
import creational.abstractFactory.QA;
import creational.abstractFactory.TeamFactory;

public class BankTeam implements TeamFactory {
    @Override
    public Developer getDev() {
        return new JavaDeveloper();
    }

    @Override
    public QA getQA() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getPM() {
        return new BigPM();
    }
}
