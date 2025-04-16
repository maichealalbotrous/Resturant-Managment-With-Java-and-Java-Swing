import java.util.List;

public class Currentorder implements opration {

    @Override
    public void Menu(DataBase DataBase) {
        List<AddToCart> List = DataBase.getCartList();
        int count = 0;
        for (AddToCart addToCart : List) {
            System.out.print("Name :" + addToCart.getName() + "||" + "phone number :" + addToCart.getPhonenumber()
                    + "||" + "OrderWay :" + addToCart.getPrice() + "||");
            System.out.println("Produts:{");
            List<Products> products = addToCart.getProductsList();
            for (Products Products : products) {
                System.out.print("Name :" + Products.getName() + "||" + "Price:" + Products.getPrice() + "||"
                        + "getIngredients" + "[");
                for (String ing : Products.getIngredients()) {
                    System.out.print(ing + ",");
                }
                System.out.print("]");
            }
            System.out.print("}");

            if (count % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println("The Total Order :" + List.size());
        // Employee Employee = new Employee();
        // Employee.Menu(DataBase);
    }

}
