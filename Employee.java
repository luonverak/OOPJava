package OOP.Inher;
public class Employee extends People{
    
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String name, String gender, int age,String position, float salary) {
        super(id, name, gender, age);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "\t" + position + "\t" + salary;
    }
    public void add(){}
}
