package behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> event) {
        System.out.println("Dear " + name + "we have smth for you " + event);
    }
}
