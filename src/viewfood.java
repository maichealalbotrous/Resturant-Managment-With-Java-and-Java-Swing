
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class viewfood implements opration {
    static Scanner in = new Scanner(System.in);
    static DataBase database = new DataBase();

    public viewfood() {
    }

    @Override
    public void Menu(DataBase database) {
        int choice;
        do {
            System.out.println("What do you want to show?\n" +
                    "1: Drink\n" +
                    "2: FastFood\n" +
                    "3: Appetizers\n" +
                    "4: Sweets\n" +
                    "5: All Products\n" +
                    "6: Return to admin menu\n");

            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    ShowProducts(database.getDrinksList(), "Drink");
                    break;
                case 2:
                    ShowProducts(database.getFastFoodList(), "FastFood");
                    break;
                case 3:
                    ShowProducts(database.getAppetizersList(), "Appetizers");
                    break;
                case 4:
                    ShowProducts(database.getSweetsList(), "Sweets");
                    break;
                case 5:
                    ShowProducts(database.getProductsList(), "All Products");
                    break;
                default:
                    break;
            }
        } while (choice != 6);
        Admin Admin = new Admin();
        Admin.Menu(database);
    }

    public void ShowProducts(List<Products> productList, String type) {
        if (productList != null && !productList.isEmpty()) {
            AdminViewproduct AdminViewFood = new AdminViewproduct(productList);
            for (Products product : productList) {
                System.out.println("Name: " + product.getName());
                System.out.println("Price: " + product.getPrice());
                System.out.print("Ingredients: ");
                if (product.getIngredients() != null) {
                    for (String ingredient : product.getIngredients()) {
                        System.out.print(ingredient + ",");
                    }
                }
                System.out.println();
            }
            AdminViewFood.setVisible(true);
            AdminViewFood.pack();
        
        } else {
            System.out.println("sorry No " + type + " found...");
        }
    }


//====================================================================================
//====================================================================================



    
    public void ShowProductsCustomer(List<Products> productList, String type) {
        if (productList != null && !productList.isEmpty()) {
            CustomerViewFoodUi CustomerViewFoodUi = new CustomerViewFoodUi(productList);
            for (Products product : productList) {
                System.out.println("Name: " + product.getName());
                System.out.println("Price: " + product.getPrice());
                System.out.print("Ingredients: ");
                if (product.getIngredients() != null) {
                    for (String ingredient : product.getIngredients()) {
                        System.out.print(ingredient + ",");
                    }
                }
                System.out.println();
            }
            CustomerViewFoodUi.setVisible(true);
            CustomerViewFoodUi.pack();
        
        } else {
            System.out.println("sorry No " + type + " found...");
        }
    }
}