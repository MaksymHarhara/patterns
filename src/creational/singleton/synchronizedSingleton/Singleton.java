package creational.singleton.synchronizedSingleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton() {

    }
    public static Singleton getInstance() {
        Singleton result = singleton;
        if(result != null) {
            return result;
        }

        synchronized (Singleton.class) {
            if(singleton == null) {
                return singleton = new Singleton();
            }
            return singleton;
        }
    }
}
