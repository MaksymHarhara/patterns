package structural.proxy;

public class Runner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com");

        project.run();
    }
}
