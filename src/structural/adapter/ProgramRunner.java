package structural.adapter;

public class ProgramRunner {
    public static void main(String[] args) {
        Databese databese = new AdapterJavaAppToDB();

        databese.update();
        databese.create();
        databese.delete();
        databese.insert();
    }
}
