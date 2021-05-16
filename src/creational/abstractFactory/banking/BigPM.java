package creational.abstractFactory.banking;

import creational.abstractFactory.ProjectManager;

public class BigPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project managing");
    }
}
