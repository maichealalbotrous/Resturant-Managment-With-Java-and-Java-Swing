import java.util.Scanner;

public class Admin extends User implements opration {
    static Scanner in = new Scanner(System.in);

    public Admin() {
        this.opration = new opration[] {
                new viewfood(),
                new addfood(),
                new deletfood(),
                new Employeeimp(),
        };
    }

    @Override
    public void Menu(DataBase DataBase) {
        System.out.println("1:view menu\n"
                + "2:AddFood\n"
                + "3:DeletFood\n"
                + "4:Add Employee");
        int n = in.nextInt();
        this.opration[n - 1].Menu(DataBase);

    }

    
    @Override
    public String toString() {
        return  name+"</N>" +password+"</N>" ;
    }

}