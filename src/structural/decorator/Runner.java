package structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Developer developer = new TeamLead(new SeniorJavaDev(new JavaDev()));

        System.out.println(developer.makeJob());
    }
}
