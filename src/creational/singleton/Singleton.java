package creational.singleton;

public class Singleton {
    private static Singleton singleton;

    public static Singleton getInstance() {
        if(singleton == null) {
            return singleton = new Singleton();
        } else
            return singleton;
    }

    private Singleton() {

    }
}
