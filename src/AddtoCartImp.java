import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class AddtoCartImp {
    static Scanner in = new Scanner(System.in);
    static DataBase DataBase = new DataBase();

    public AddtoCartImp() {
    }

    public void Order(List<Products> List, String type, AddToCart AddToCart) throws FoodNotFoundException {

        int chois;
        do {
            System.out.println(
                    "1:put the name of " + type + "\n" +
                            "2:return the mennu\n" +
                            "3:make pay");
            String input = in.next();
            chois = Integer.parseInt(input);

            switch (chois) {
                case 1:
                    // putproduct(List, AddToCart,name);
                    break;
                case 2:
                    CustomerMenu Customermenu = new CustomerMenu();
                    Customermenu.Customermenu(DataBase, AddToCart);
                    break;
                case 3:
                    // payinfo(AddToCart);
                    break;
                default:
                    break;
            }

        } while (chois != 4);

    }

    public void putproduct(AddToCart AddToCart, String name) throws FoodNotFoundException {
        System.out.println("Pleas Enter The Name of " + ":");
        // String name = in.next();
        boolean found = false;
        for (Products p : DataBase.getProductsList()) {
            if (name.equalsIgnoreCase(p.getName())) {
                DataBase.addProductscustomercard(p);
                DataBase.AddAllProductsOrder(p);
                DataBase.SaveallOrderProducts();
                System.out.println("the " + "added sucessfully");
                found = true;
                return;
            } 
        }
        if (found == false) {
            System.out.println("sorry, but the " + "not found");
            JOptionPane.showMessageDialog(null, name+" not found", "food not found Error", JOptionPane.ERROR_MESSAGE);
            throw new FoodNotFoundException(name);
        }

    }

    public void payinfo(AddToCart AddToCart, String wayin, String name, String phon, String code)
            throws FoodNotFoundException {
        System.out.println("pleas enter the way of order : (1)Delevary , (2)insid the resturant ");
        // String way = "insid the resturant
        // int wayin = in.nextInt();

        AddToCart.setOrderWay(getway(wayin));
        System.out.println("pleas enter the name");
        // String name = in.next();
        AddToCart.setName(name);
        System.out.println("pleas enter the phone number ");
        // String phon = in.next();
        AddToCart.setPhonenumber(phon);
        AddToCart.setPrice(GetThePrice(DataBase.getProductscustomercard()));
        DataBase.addcart(AddToCart);
        DataBase.addOrder(AddToCart);
        DataBase.addcustomercard(AddToCart);
        DataBase.SaveAllOrder();
   
        MakePayment MakePayment = new MakePayment();
        MakePaymentimp MakePaymentimp = new MakePaymentimp();
        MakePaymentimp.GetPay(AddToCart, MakePayment, code);
    }

    public Double GetThePrice(List<Products> List) {
        Double Price = 0.0;
        for (Products products : List) {
            Price += products.getPrice();
        }
        return Price;
    }

    public String getway(String way) {
        String wayofdelev = "Prepration...";
        if (way.trim().equals( "1")) {
            wayofdelev = "Delevaried";
        } else if (way.trim().equals( "2")) {
            wayofdelev = "Prepration";
        }
        return wayofdelev;

    }
}
