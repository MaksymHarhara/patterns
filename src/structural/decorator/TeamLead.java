package structural.decorator;

public class TeamLead extends DeveloperDecorator{

    public TeamLead(Developer developer) {
        super(developer);
    }

    public String makeReport() {
        return " Make report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeReport();
    }
}
