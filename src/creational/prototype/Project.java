package creational.prototype;

public class Project implements Copyable{
    private String name;
    private int id;
    private String code;

    public Project(String name, int id, String code) {
        this.name = name;
        this.id = id;
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object copy() {
        Project copy = new Project(name, id, code);
        return copy;
    }

    @Override
    public String toString() {
        return "id=" + id + " name=" + name + " code=" + code;
    }
}
