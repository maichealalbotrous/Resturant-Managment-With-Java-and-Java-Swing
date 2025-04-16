import java.io.IOException;
import java.util.Scanner;

public class Employeeimp implements opration {
    Scanner in = new Scanner(System.in);

    @Override
    public void Menu(DataBase DataBase) {
        Employee Employee = new Employee();
        System.out.println("pleas enter the name ");
        String name = in.next();
        Employee.setName(name);
        System.out.println("pleas eneter your password");
        String password = in.next();
        Employee.setPassword(password);
        DataBase.addEmployee(Employee);
        DataBase.SaveEmployeeUser();
        try {
            DataBase.GetEmployeeUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("the Employee has added Succesfuly");
    }

}
