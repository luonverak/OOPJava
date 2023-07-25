
package OOP.Inher;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom extends Functionality{

    public ClassRoom() {
    }
    
    List<Student> list = new ArrayList<>();
    Student student = new Student();
    
    @Override
    void add() {
        for(int i=0;i<3;i++){
            student = new Student();
            student.add();
            list.add(student);
        }
    }

    @Override
    void view() {
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
    
    
}
