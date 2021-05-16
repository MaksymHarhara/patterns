package creational.factory;

public class CppDevFactory implements DevFactory{
    @Override
    public Developer createDev() {
        return new CppDev();
    }
}
