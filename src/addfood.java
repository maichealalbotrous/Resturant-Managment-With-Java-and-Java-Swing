import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class addfood implements opration {
    static Scanner in = new Scanner(System.in);
    static int chois;
    static DataBase DataBase = new DataBase();

    public addfood() {
    };

    @Override
    public void Menu(DataBase DataBase) {
        System.out.println("pleas enter chois");
        System.out.println("1: if you want to add drinks " + "\n" + "2: if you want to add fastfood " + "\n"
                + "3: if you want to add Appetizers " + "\n" + "4: if you want to add Sweets " + "\n"
                + "5:Exite and return  the menu");
        chois = in.nextInt();
        do {
            switch (chois) {
                case 1:
                    // AddProduct(DataBase.getDrinksList(), "Drink");
                    break;

                case 2:
                    // AddProduct(DataBase.getFastFoodList(), "FastFood");

                    break;

                case 3:
                    // AddProduct(DataBase.getAppetizersList(), "Appetizers");
                    break;

                case 4:
                    // AddProduct(DataBase.getSweetsList(), "Sweet");
                    break;

                default:
                    break;
            }
        } while (chois != 5);
        Customer Customer = new Customer();
        AddToCart AddToCart = new AddToCart();
        // Customer.Customermenu(DataBase, AddToCart);

        // Admin a = new Admin();
        // a.Menu(DataBase);
    }

    // AddProducts_method;//////////////////////////////////////////////////////////////////
    public void AddProduct(List<Products> List, String type,String name,Double price,int numofing,String []ingredient) {
        Products newProduct = CreatProductByType(type);

        System.out.println("Please enter the name of Product");
        //  name = in.next();
        newProduct.setName(name);

        System.out.println("Please enter the price of Product");
        //  price = in.nextDouble();
        newProduct.setPrice(price);

        System.out.println("Please enter the number of ingredients of Product");
        //  numofing = in.nextInt();

        // ingredient = new String[numofing];
        // for (int i = 0; i < ingredient.length; i++) {
        //     System.out.println("Please Enter the ingredient number :" + (i + 1));
        //     String ing = in.next();
        //     ingredient[i] = ing;
        // }
        newProduct.setIngredient(ingredient);

        if (type == "Drink") {
            DataBase.adddrink(newProduct);
            DataBase.addProducts(newProduct);
            DataBase.SaveDrinks();
            DataBase.SaveProducts();

            // Menu(DataBase);

        }
        if (type == "FastFood") {
            DataBase.addFastFood(newProduct);
            DataBase.addProducts(newProduct);
            DataBase.SaveFastFood();
            DataBase.SaveProducts();

            // Menu(DataBase);

        }
        if (type == "Appetizers") {
            DataBase.addAppetizers(newProduct);
            DataBase.addProducts(newProduct);
            DataBase.SaveAppetizers();
            DataBase.SaveProducts();

            // Menu(DataBase);

        }
        if (type == "Sweet") {
            DataBase.addSweets(newProduct);
            DataBase.addProducts(newProduct);
            DataBase.SaveSweets();
            DataBase.SaveProducts();

            // Menu(DataBase);

        }

    }

    public Products CreatProductByType(String type) {

        Products newProduct;
        if (type == "Drink") {
            newProduct = new Drinks();
        } else if (type == "FastFood") {
            newProduct = new FastFood();
        } else if (type == "Appetizers") {
            newProduct = new Appetizers();
        } else if (type == "Sweet") {
            newProduct = new Sweets();
        } else {
            System.out.println("Invalid food type!");
            return null;
        }
        return newProduct;
    }
}
