package behavioral.command;

public class CreateCommand implements Command{

    DB databese;

    public CreateCommand(DB databese) {
        this.databese = databese;
    }

    @Override
    public void execute() {
        databese.create();
    }
}
