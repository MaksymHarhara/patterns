package behavioral.command;

public class Runner {
    public static void main(String[] args) {
        DB databese = new DB();

        Dev dev = new Dev(
                new CreateCommand(databese),
                new DeleteCommand(databese)
        );

        dev.createRecord();
        dev.deleteRecord();
    }
}
