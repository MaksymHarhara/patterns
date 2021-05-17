package behavioral.command;

public class Dev {
    Command create;
    Command delete;

    public Dev(Command create, Command delete) {
        this.create = create;
        this.delete = delete;
    }

    public void createRecord() {
        create.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }
}
