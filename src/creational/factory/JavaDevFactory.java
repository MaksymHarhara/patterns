package creational.factory;

public class JavaDevFactory implements DevFactory{

    @Override
    public Developer createDev() {
        return new JavaDev();
    }
}
