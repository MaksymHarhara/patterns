package structural.bridge;

public class BankSystem2 extends Program{

    protected BankSystem2(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development");
        developer.writeCode();
    }
}
