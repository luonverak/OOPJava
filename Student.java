package OOP.Inher;

import java.util.Scanner;

public class Student extends People implements GPA{
    
    private float score1;
    private float score2;
    private float score3;

    public Student() {
    }

    public Student(int id, String name, String gender, int age,float score1, float score2, float score3) {
        super(id, name, gender, age);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    @Override
    public float total() {
        return 0;
    }

    @Override
    public float average() {
        return 0;
    }

    @Override
    public String grade() {
        return null;
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id : "); id=sc.nextInt();
    }
    @Override
    public String toString() {
        return super.toString()+ "\t" + score1 + "\t" + score2 + "\t" + score3;
    }
}
