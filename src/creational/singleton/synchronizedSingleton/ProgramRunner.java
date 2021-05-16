package creational.singleton.synchronizedSingleton;

public class ProgramRunner {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new Thread1());
        Thread threadBar = new Thread(new Thread2());
        threadFoo.start();
        threadBar.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.toString());
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.toString());
        }
    }
}
