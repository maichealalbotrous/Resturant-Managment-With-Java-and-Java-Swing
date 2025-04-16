import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    List<User> AdminUserList = new ArrayList<>();//
    List<User> EmployeeList = new ArrayList<>();//
    List<Products> ProductsList = new ArrayList<>();//
    static List<AddToCart> cartListDaily = new ArrayList<>();
    static List<AddToCart> CustomerCard = new ArrayList<>();
    static List<Products> productscustomercard = new ArrayList<>();

    List<AddToCart> AllOrderList = new ArrayList<>();//
    static List<MakePayment> Dailypayment = new ArrayList<>();
    List<MakePayment> AllThePayment = new ArrayList<>();//
    List<Products> AllProductsOrder = new ArrayList<>();

   

    List<Products> DrinksList = new ArrayList<>();//
    List<Products> AppetizersList = new ArrayList<>();//
    List<Products> FastFoodList = new ArrayList<>();//
    List<Products> SweetsList = new ArrayList<>();//
    // =========================================================================================================
    // =========================================================================================================
    File Data = new File("data");
    File AdminUserListFile = new File("data/AdminUserList.txt");
    File EmployeeListFile = new File("data/EmployeeList.txt");
    File ProductsListFile = new File("data/ProductsList.txt");
    File AllOrderListFile = new File("data/AllOrderList.txt");
    File AllThePaymentFile = new File("data/AllThePayment.txt");
    File AllProductsOrderFile = new File("data/AllProductsOrder.txt");
    File DrinksListFile = new File("data/DrinksList.txt");
    File AppetizersListFile = new File("data/AppetizersList.txt");
    File FastFoodListFile = new File("data/FastFoodList.txt");
    File SweetsListFile = new File("data/SweetsList.txt");

    // =========================================================================================================
    // =========================================================================================================
    // CreatFill.....CreatFolder//
    public DataBase() {
        if (Data.exists() == false) {
            Data.mkdirs();
        }
        if (AdminUserListFile.exists() == false) {
            try {
                AdminUserListFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (EmployeeListFile.exists() == false) {
            try {
                EmployeeListFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (ProductsListFile.exists() == false) {
            try {
                ProductsListFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (AllOrderListFile.exists() == false) {
            try {
                AllOrderListFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (AllThePaymentFile.exists() == false) {
            try {
                AllThePaymentFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (DrinksListFile.exists() == false) {
            try {
                DrinksListFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (AppetizersListFile.exists() == false) {
            try {
                AppetizersListFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (FastFoodListFile.exists() == false) {
            try {
                FastFoodListFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (SweetsListFile.exists() == false) {
            try {
                SweetsListFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            GetAdminUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            GetEmployeeUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            GetProducts();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            GetAllOrder();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            GetAllPayment();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            GetDrinkeList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            GetFatsfoodList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            GetSweetsList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            GetAppetizersList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            GetAllProductsOrder();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // =========================================================================================================
    // =========================================================================================================
    // saveData//

    public void SaveAdminUser() {
        String text = "";
        for (User Admin : AdminUserList) {
            text += Admin.toString() + "</NewUser>";
        }
        System.out.println("the user has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(AdminUserListFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void SaveEmployeeUser() {
        String text = "";
        for (User Employee : EmployeeList) {
            text += Employee.toString() + "</NewUser>";
        }
        System.out.println("the user has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(EmployeeListFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void SaveallOrderProducts() {
        String text = "";
        for (Products p : AllProductsOrder) {
            text += p.toString() + "</NewUser>";
        }
        System.out.println("the user has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(AllProductsOrderFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public void SaveProducts() {
        String text = "";
        for (Products Product : ProductsList) {
            text += Product.toString() + "</NewUser>";
        }
        System.out.println("the Products has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(ProductsListFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void SaveAllOrder() {
        String text = "";
        for (AddToCart order : AllOrderList) {
            text += order.toString() + "</NewUser>";
        }
        System.out.println("the Products has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(AllOrderListFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void SaveAllpayment() {
        String text = "";
        for (MakePayment Pay : AllThePayment) {
            text += Pay.toString() + "</NewUser>";
        }
        System.out.println("the Products has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(AllThePaymentFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void SaveDrinks() {
        String text = "";
        for (Products Drink : DrinksList) {
            text += Drink.toString() + "</NewUser>";
        }
        System.out.println("the Products has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(DrinksListFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void SaveFastFood() {
        String text = "";
        for (Products FastFood : FastFoodList) {
            text += FastFood.toString() + "</NewUser>";
        }
        System.out.println("the Products has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(FastFoodListFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void SaveSweets() {
        String text = "";
        for (Products Sweet : SweetsList) {
            text += Sweet.toString() + "</NewUser>";
        }
        System.out.println("the Products has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(SweetsListFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void SaveAppetizers() {
        String text = "";
        for (Products Appetizer : AppetizersList) {
            text += Appetizer.toString() + "</NewUser>";
        }
        System.out.println("the Products has added sucssecfuly");
        try {
            PrintWriter Pr = new PrintWriter(AppetizersListFile);
            Pr.write(text);
            Pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // =========================================================================================================
    // =========================================================================================================
    // GetData//
    public void GetAdminUser() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(AdminUserListFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                String[] a2 = s.split("</N>");
                if (a2.length > 0) {

                    Admin Admin = new Admin();
                    Admin.setName(a2[0]);
                    Admin.setPassword(a2[1]);
                    addAdmin(Admin);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void GetEmployeeUser() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(EmployeeListFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                String[] a2 = s.split("</N>");
                if (a2.length > 0) {
                    Employee Employee = new Employee();
                    Employee.setName(a2[0]);
                    Employee.setPassword(a2[1]);
                    addEmployee(Employee);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void GetProducts() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(ProductsListFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                if (s.isEmpty()) {
                    continue;
                }
                String[] a2 = s.split("</N>");
                if (a2.length > 1) {
                    Products products = new Products();
                    products.setName(a2[0]);
                    products.setPrice(Double.parseDouble(a2[1]));
                    products.setIngredient(a2[2].split(","));
                    addProducts(products);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    public void GetAllProductsOrder() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(AllProductsOrderFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                if (s.isEmpty()) {
                    continue;
                }
                String[] a2 = s.split("</N>");
                if (a2.length > 1) {
                    Products products = new Products();
                    products.setName(a2[0]);
                    products.setPrice(Double.parseDouble(a2[1]));
                    products.setIngredient(a2[2].split(","));
                    AddAllProductsOrder(products);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void GetAllOrder() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(AllOrderListFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                if (s.isEmpty()) {
                    continue;
                }

                String[] a2 = s.split("</N>");
                if (a2.length >= 1) {
                    AddToCart addtoCart = new AddToCart();
                    addtoCart.setOrderWay(a2[0]);
                    addtoCart.setPrice(Double.parseDouble(a2[1]));
                    addtoCart.setName(a2[2]);
                    addtoCart.setPhonenumber(a2[3]);
                    
                    
                    addOrder(addtoCart);
                } else {
                    System.err.println("Invalid order format: " + a1);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void GetAllPayment() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(AllThePaymentFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");

            for (String s : a1) {
                if (s.isEmpty()) {
                    continue;
                }
                String[] a2 = s.split("</N>");
                if (a2.length >= 0) {

                    MakePayment makePayment = new MakePayment();
                    makePayment.setname(a2[0]);
                    makePayment.setCode(a2[1]);
                    makePayment.setDate(LocalDate.parse(a2[2]));
                    makePayment.setPrice(Double.parseDouble(a2[1]));
                    addPayment(makePayment);
                } else {
                    System.err.println("Invalid payment format: " + a1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void GetDrinkeList() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(DrinksListFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                if (s.isEmpty()) {
                    continue;
                }

                String[] a2 = s.split("</N>");
                if (a2.length >= 3) {

                    Drinks Drink = new Drinks();
                    Drink.setName(a2[0]);
                    Drink.setPrice(Double.parseDouble(a2[1]));
                    Drink.setIngredient(a2[2].split(","));
                    adddrink(Drink);
                } else {
                    System.err.println("Invalid drink format: " + s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void GetFatsfoodList() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(FastFoodListFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                if (s.isEmpty()) {
                    continue;
                }

                String[] a2 = s.split("</N>");
                if (a2.length >= 3) {

                    FastFood fastFood = new FastFood();
                    fastFood.setName(a2[0]);
                    fastFood.setPrice(Double.parseDouble(a2[1]));
                    fastFood.setIngredient(a2[2].split(","));
                    addFastFood(fastFood);
                } else {
                    System.err.println("Invalid drink format: " + s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void GetAppetizersList() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(AppetizersListFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                if (s.isEmpty()) {
                    continue;
                }
                String[] a2 = s.split("</N>");
                if (a2.length >= 3) {

                    Appetizers Appetizers = new Appetizers();
                    Appetizers.setName(a2[0]);
                    Appetizers.setPrice(Double.parseDouble(a2[1]));
                    Appetizers.setIngredient(a2[2].split(","));
                    addAppetizers(Appetizers);
                } else {
                    System.err.println("Invalid drink format: " + s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void GetSweetsList() throws IOException {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(SweetsListFile));
            String Line;
            while ((Line = br.readLine()) != null) {
                text += Line;
            }
            String[] a1 = text.split("</NewUser>");
            for (String s : a1) {
                if (s.isEmpty()) {
                    continue;
                }
                String[] a2 = s.split("</N>");
                if (a2.length >= 3) {

                    Sweets Sweets = new Sweets();
                    Sweets.setName(a2[0]);
                    Sweets.setPrice(Double.parseDouble(a2[1]));
                    Sweets.setIngredient(a2[2].split(","));
                    addSweets(Sweets);
                } else {
                    System.err.println("Invalid drink format: " + s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // =========================================================================================================
    // =========================================================================================================
    public void DeletDataFromFile(String type) {
        if (type.equals("Drink")) {
            String text = "";
            for (Products p : DrinksList) {
                text += p.toString() + "</NewUser>";
            }
            File file = new File("data/DrinksList.txt");
            try {
                PrintWriter pr = new PrintWriter(new FileWriter(file));
                pr.print(text);
                pr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        if (type.equals("FastFood")) {
            String text = "";
            for (Products p : FastFoodList) {
                text += p.toString() + "</NewUser>";
            }
            File file = new File("data/FastFoodList.txt");
            try {
                PrintWriter pr = new PrintWriter(new FileWriter(file));
                pr.print(text);
                pr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        if (type.equals("Appetizer")) {
            String text = "";
            for (Products p : AppetizersList) {
                text += p.toString() + "</NewUser>";
            }
            File file = new File("data/AppetizersList.txt");
            try {
                PrintWriter pr = new PrintWriter(new FileWriter(file));
                pr.print(text);
                pr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        if (type.equals("Sweet")) {
            String text = "";
            for (Products p : SweetsList) {
                text += p.toString() + "</NewUser>";
            }
            File file = new File("data/SweetsList.txt");
            try {
                PrintWriter pr = new PrintWriter(new FileWriter(file));
                pr.print(text);
                pr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void DeletDataFromProductsFile() {
        String text = "";
        for (Products p : ProductsList) {
            text += p.toString() + "</NewUser>";
        }
        File file = new File("data/ProductsList.txt");
        try {
            PrintWriter pr = new PrintWriter(new FileWriter(file));
            pr.print(text);
            pr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SaveOrderAfterAddFile() {
        String text = "";
        for (AddToCart p : AllOrderList) {
            text += p.toString() + "</NewUser>";
        }
        File file = new File("data/AllOrderList.txt");
        try {
            PrintWriter pr = new PrintWriter(new FileWriter(file));
            pr.print(text);
            pr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SavePaymentAfterAddFile() {
        String text = "";
        for (MakePayment p : AllThePayment) {
            text += p.toString() + "</NewUser>";
        }
        File file = new File("data/AllThePayment.txt");
        try {
            PrintWriter pr = new PrintWriter(new FileWriter(file));
            pr.print(text);
            pr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // =========================================================================================================
    // =========================================================================================================
    public void addProducts(Products Products) {
        ProductsList.add(Products);
    }

    public void addcustomercard(AddToCart AddToCart) {
        CustomerCard.add(AddToCart);
    }

    public void addEmployee(Employee Employee) {
        EmployeeList.add(Employee);
    }


public void AddAllProductsOrder(Products allProductsOrder) {
    AllProductsOrder.add(allProductsOrder);
}
    public static void addProductscustomercard(Products Product) {
        DataBase.productscustomercard.add(Product);
    }

    public void addAdmin(Admin Admin) {
        AdminUserList.add(Admin);
    }

    public void addPayment(MakePayment MakePayment) {
        AllThePayment.add(MakePayment);
    }

    public void addDailyPayment(MakePayment MakePayment) {
        Dailypayment.add(MakePayment);
    }

    public void addcart(AddToCart AddToCart) {
        cartListDaily.add(AddToCart);
    }

    public void addOrder(AddToCart AddToCart) {
        AllOrderList.add(AddToCart);
    }

    public void adddrink(Products Drinks) {
        DrinksList.add(Drinks);
    }

    public void addAppetizers(Products Appetizers) {
        AppetizersList.add(Appetizers);
    }

    public void addFastFood(Products FastFood) {
        FastFoodList.add(FastFood);
    }

    public void addSweets(Products Sweets) {
        SweetsList.add(Sweets);
    }

    public static List<Products> getProductscustomercard() {
        return productscustomercard;
    }

    public List<User> getAdminUserList() {
        return AdminUserList;
    }

    public List<User> getEmployeeList() {
        return EmployeeList;
    }

    public List<Products> getProductsList() {
        return ProductsList;
    }

     public List<Products> getAllProductsOrder() {
        return AllProductsOrder;
    }

    public List<AddToCart> getCartList() {
        return cartListDaily;
    }

    public static List<AddToCart> getCustomerCard() {
        return CustomerCard;
    }

    public List<MakePayment> getAllThePayment() {
        return AllThePayment;
    }

    public static List<MakePayment> getDailypayment() {
        return Dailypayment;
    }

    public List<AddToCart> getOrderList() {
        return AllOrderList;
    }

    public List<Products> getDrinksList() {
        return DrinksList;
    }

    public List<Products> getAppetizersList() {
        return AppetizersList;
    }

    public List<Products> getFastFoodList() {
        return FastFoodList;
    }

    public List<Products> getSweetsList() {
        return SweetsList;
    }
    // =========================================================================================================
    // =========================================================================================================

    public int AdminLogin(String name, String paswword) {
        int i = -1;
        for (User a : AdminUserList) {
            if (a.getName().matches(name) && a.getPassword().matches(paswword)) {
                i = AdminUserList.indexOf(a);
                break;
            }

        }
        return i;
    }

    public int EmployeeLogin(String name, String paswword) {
        int i = -1;
        for (User a : EmployeeList) {
            if (a.getName().matches(name) && a.getPassword().matches(paswword)) {
                i = EmployeeList.indexOf(a);
                break;
            }

        }
        return i;
    }

    public User GetAdminUser(int index) {
        if (index >= 0 && index <= AdminUserList.size()) {
            return AdminUserList.get(index);
        }
        return null;
    }

    public User GetEmployeeUser(int index) {
        if (index >= 0 && index <= EmployeeList.size()) {
            return EmployeeList.get(index);
        }
        return null;
    }
}
