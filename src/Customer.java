import java.util.Scanner;

public class Customer implements CustemerMuneint{

    CustemerMuneint[] operation;

    public  Customer() {
        this.operation = new CustemerMuneint[] {
            new CustomerMenu(),
        };
    }

    static Scanner in =  new Scanner(System.in);



   


    @Override
    public void Customermenu(DataBase DataBase, AddToCart AddToCart) throws FoodNotFoundException {
        System.out.println(
            "1:view custemer menu\n"
            );
            int n = in.nextInt();
            this.operation[n - 1].Customermenu(DataBase, AddToCart);
    }

}
