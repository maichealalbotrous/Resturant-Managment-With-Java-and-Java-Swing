import java.util.Scanner;

public class Employee extends User implements opration {
    Scanner in = new Scanner(System.in);

    Employee() {
        this.opration = new opration[] {
                new Currentorder(),
                new DailyPayment(),
                new regularcustomer(),
                new MostOrderProducts(),
                new AllPayment(),
        };
    }

    @Override
    public void Menu(DataBase DataBase) {
        System.out.println(
                "1:show the Currntorder\n" +
                        "2:show the Daily payment\n" +
                        "3:Show the Regular visitores\n"+
                        "4:Show the MostOrderProducts\n"+
                        "5:Show All Payment\n");
        int n = in.nextInt();
        this.opration[n - 1].Menu(DataBase);

    }

    @Override
    public String toString() {
        return name + "</N>" + password + "</N>";
    }
}
