import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class deletfood implements opration {
    static Scanner in = new Scanner(System.in);
    static DataBase DataBase = new DataBase();

    @Override
    public void Menu(DataBase DataBase) {
        System.out.println("pleas enter chois");
        System.out.println("1: if you want to delet drinks " + "\n" + "2: if you want to delet fastfood " + "\n"
                + "3: if you want to delet Appetizers " + "\n" + "4: if you want to delet Sweets " + "\n"
                + "5:Exite and return  the menu");
        int chois = in.nextInt();
        switch (chois) {
            case 1:
                // deletProducts(DataBase.getDrinksList(), "Drink");
                break;
            case 2:
                // deletProducts(DataBase.getFastFoodList(), "FastFood");
                break;
            case 3:
                // deletProducts(DataBase.getAppetizersList(), "Appetizer");
                break;
            case 4:
                // deletProducts(DataBase.getSweetsList(), "Sweet");
                break;
            default:
                break;
        }
    }

    public void deletProducts(List<Products> List, String type, String name) {

        System.out.println("pleas enter the name of Product");
        // String name = in.next();
        for (Products p : List) {
            if (p.getName().equals(name)) {
                if (type.equals("Drink")) {
                    DataBase.DrinksList.remove(p);
                    DataBase.DeletDataFromFile(type);
                }
                if (type.equals("FastFood")) {
                    DataBase.FastFoodList.remove(p);
                    DataBase.DeletDataFromFile(type);
                }
                if (type.equals("Appetizer")) {
                    DataBase.AppetizersList.remove(p);
                    DataBase.DeletDataFromFile(type);
                }
                if (type.equals("Sweet")) {
                    DataBase.SweetsList.remove(p);
                    DataBase.DeletDataFromFile(type);
                }

                System.out.println("the product was removed From " + type);
                break;
            }

        }

        for (Products pro : DataBase.getProductsList()) {
            if (pro.getName().equals(name)) {
                DataBase.ProductsList.remove(pro);
                DataBase.DeletDataFromProductsFile();
                // Admin Admin = new Admin();
                // Admin.Menu(DataBase);
                System.out.println("The Products was removed from Products List");
                break;
            }
        }

    }

    
}
