
package OOP.Inher;

import java.util.ArrayList;
import java.util.List;

public class Office extends Functionality{

    Employee employee = new Employee();
    List<Employee> list = new ArrayList<>();
    @Override
    void add() {
        for(int i=0;i<3;i++){
            employee = new Employee();
            employee.add();
            list.add(employee);
        }
    }

    @Override
    void view() {
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
    
}
