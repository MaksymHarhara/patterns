package behavioral.observer;

import java.util.List;

public class EventSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addEvent("First event");

        jobSite.addEvent("Second event");

        Observer firstMan = new Subscriber("Maks ");
        Observer secondMan = new Subscriber("Oleg ");

        jobSite.addObserver(secondMan);
        jobSite.addObserver(firstMan);

        jobSite.addEvent("Third event");
    }
}
