package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed{
    List<String> events = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addEvent(String event) {
        this.events.add(event);
        notifyObserver();
    }

    public void deleteEvent(String event) {
        this.events.remove(event);
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: subscribers) {
            observer.handleEvent(this.events);
        }
    }
}
