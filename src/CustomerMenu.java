import java.util.List;
import java.util.Scanner;

public class CustomerMenu implements CustemerMuneint {
    static Scanner in = new Scanner(System.in);
    static DataBase database = new DataBase();

    @Override
    public void Customermenu(DataBase DataBase, AddToCart AddToCart) throws FoodNotFoundException {
        int choice;

        System.out.println("What do you want to show?\n" +
                "1: Drink\n" +
                "2: FastFood\n" +
                "3: Appetizers\n" +
                "4: Sweets\n" +
                "5: All Products\n" +
                "6: EmployeeMenu\n" +
                "7: AdminMenu\n"

        );
        choice = in.nextInt();
        in.nextLine();

        switch (choice) {
            case 1:
                ShowProducts(database.getDrinksList(), "Drink", AddToCart);
                break;
            case 2:
                ShowProducts(database.getFastFoodList(), "FastFood", AddToCart);
                break;
            case 3:
                ShowProducts(database.getAppetizersList(), "Appetizers", AddToCart);
                break;
            case 4:
                ShowProducts(database.getSweetsList(), "Sweets", AddToCart);
                break;
            case 5:
                ShowProducts(database.getProductsList(), "All Products", AddToCart);
                break;
            case 6:
                Employee Employee = new Employee();
                Employee.Menu(DataBase);
                break;
                case 7:
                Admin admin = new Admin();
                admin.Menu(DataBase);
            default:
                break;
        }

    }

    public void ShowProducts(List<Products> productList, String type, AddToCart AddToCart)
            throws FoodNotFoundException {
        if (productList != null && !productList.isEmpty()) {
            for (Products product : productList) {
                int count = 0;
                System.out.print("Name: " + product.getName() + " || Price: " + product.getPrice() + " || ");
                if (product.getIngredients() != null) {
                    System.out.print("Ingredients: [ ");
                    for (String ingredient : product.getIngredients()) {
                        System.out.print(ingredient + ",");
                    }
                    System.out.print("]");
                }
                System.out.print("\t");

                if (count % 3 == 0) {
                    System.out.println();
                }

            }
            System.out.println();
            new AddtoCartImp().Order(productList, type, AddToCart);
        } else {
            System.out.println("sorry No " + type + " found...");
        }
    }

}