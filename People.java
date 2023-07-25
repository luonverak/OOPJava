package OOP.Inher;

public class People {
    
    protected int id;
    protected String name;
    protected String gender;
    protected int age;

    public People() {
    }

    public People(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\t" + id + "\t" + name + "\t" + gender + "\t" + age;
    }
    
}
