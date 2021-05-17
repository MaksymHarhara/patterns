package behavioral.command;

public class DeleteCommand implements Command{

    DB database;

    public DeleteCommand(DB database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
