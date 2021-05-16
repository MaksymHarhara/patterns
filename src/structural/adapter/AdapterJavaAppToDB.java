package structural.adapter;

public class AdapterJavaAppToDB extends JavaApp implements Databese{

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void create() {
        loadObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
