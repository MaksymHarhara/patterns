package structural.bridge;

public class ProgramRunner {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDev()),
                new BankSystem2(new CppDev())
        };

        for(Program program: programs) {
            program.developProgram();
        }
    }
}
