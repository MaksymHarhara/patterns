package creational.abstractFactory;

public interface TeamFactory {
    Developer getDev();
    QA getQA();
    ProjectManager getPM();
}
