package behavioral.iterator;

public class Runner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "SQL"};

        JavaDev javaDev = new JavaDev("Maksym Harhara", skills);

        Iterator iterator = javaDev.getIterator();
        System.out.println("Java dev " + javaDev.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
