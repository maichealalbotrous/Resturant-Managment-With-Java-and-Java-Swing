import java.util.Scanner;

import javax.xml.crypto.Data;

public class HomePage implements opration {
    static DataBase DataBase = new DataBase();
    static Scanner in = new Scanner(System.in);

    @Override
    public void Menu(DataBase DataBase) {
        System.out.println("1:Admin Menu\n" +
                "2:Employee Menu\n" +
                "3:Customer Menu\n");

        int chois = in.nextInt();
        switch (chois) {
            case 1:
                // AdminLogin();
                break;
            case 2:
                // EmployeeMenu();
                break;
            case 3:
                CustomerMenu();
                break;
            default:
                break;
        }
    }

    public void AdminMenu() {
        Admin admin = new Admin();
        admin.Menu(DataBase);

    }

    public void EmployeeMenu() {
        Employee Employee = new Employee();
        Employee.Menu(DataBase);
    }

    public void CustomerMenu() {
        Customer Customer = new Customer();
        AddToCart AddToCart = new AddToCart();
        try {
            Customer.Customermenu(DataBase, AddToCart);
        } catch (FoodNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int AdminLogin(String name,String password) {
        // System.out.println("pleas enter the name");
        // name = in.next();
        // System.out.println("pleas enter the password");
        //  password = in.next();
        int i =  DataBase.AdminLogin(name, password);
        return i;
        // if(i!=-1)
        // {
        //    User Admin=  DataBase.AdminUserList.get(i);
        //    Admin.Menu(DataBase);
        // }
    }

    public void EmployeeLogin(String name,String password) {
        System.out.println("pleas enter the name");
        name = in.next();
        System.out.println("pleas enter the password");
         password = in.next();
        int i =  DataBase.EmployeeLogin(name, password);

        if(i!=-1)
        {
           User Employee=  DataBase.EmployeeList.get(i);
           Employee.Menu(DataBase);
        }
    }
}
