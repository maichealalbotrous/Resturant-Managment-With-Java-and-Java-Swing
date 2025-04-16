import java.io.IOException;
import java.nio.channels.Pipe.SourceChannel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class MakePaymentimp {
    static Scanner in = new Scanner(System.in);
    static DataBase DataBase = new DataBase();

    public void GetPay(AddToCart AddToCart, MakePayment MakePayment, String code) throws FoodNotFoundException {
        System.out.println("pleas enter your card code");
        // String code = in.next();
        MakePayment.setCode(code);
        LocalDate now = LocalDate.now();
        MakePayment.setDate(now);
        if (AddToCart.getOrderWay() == "Prepering") {
            System.out.println("the order In preparation");
            MakePayment.setPrice(AddToCart.getPrice());
        }
        if (AddToCart.getOrderWay() == "Delevaried") {
            System.out.println("Delivered" +"\\t"+"Tips:10$");
            MakePayment.setPrice(AddToCart.getPrice() +10.0);
        }
        MakePayment.setname(AddToCart.getName());
        DataBase.addPayment(MakePayment);
        DataBase.addDailyPayment(MakePayment);
        DataBase.SaveAllpayment();
        // try {
        //     DataBase.GetAllPayment();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        System.out.println("Thank you...");
        DataBase.CustomerCard = new ArrayList<>();
        DataBase.productscustomercard  = new ArrayList<>();
        // Customer Customer = new Customer();
        // AddToCart newAddToCart = new AddToCart();
        // Customer.Customermenu(DataBase, newAddToCart);
    }

}
