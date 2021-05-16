package creational.prototype;

public class VersionControl {
    public static void main(String[] args) {
        Project master = new Project("BigProject", 1, "Project project = new Project();");

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterCopy = projectFactory.cloneProject();

        System.out.println(masterCopy);
    }
}
