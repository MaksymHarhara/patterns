package behavioral.chainOfResponsibility;

public class SMSNotifier extends Notifier{

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS report " + message);
    }
}
