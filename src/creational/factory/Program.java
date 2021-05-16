package creational.factory;

public class Program {
    public static void main(String[] args) {
        DevFactory devFactory = new JavaDevFactory();
        Developer developer = devFactory.createDev();

        developer.writeCode();

    }
}
