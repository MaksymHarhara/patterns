package creational.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Jane")
                .withAge(32)
                .withHeight(165)
                .build();

        System.out.println(myPerson.toString());
    }
}
