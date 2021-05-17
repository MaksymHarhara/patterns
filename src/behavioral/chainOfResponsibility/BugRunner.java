package behavioral.chainOfResponsibility;

public class BugRunner {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.STANDART);
        Notifier emailNotifier = new EmailNotifier(Priority.MEDIUM);
        Notifier smsNotifier = new SMSNotifier(Priority.ALERT);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("All is good", Priority.STANDART);
        reportNotifier.notifyManager("Smth went wrong", Priority.MEDIUM);
        reportNotifier.notifyManager("RED ALERT", Priority.ALERT);
    }
}
