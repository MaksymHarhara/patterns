package behavioral.observer;

public interface Observed {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver();
}
