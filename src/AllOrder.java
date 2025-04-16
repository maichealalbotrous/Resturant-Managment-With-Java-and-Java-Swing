import java.util.List;

public class AllOrder implements opration{
   
    @Override
    public void Menu(DataBase DataBase) {
    
    }
    public void AllOrdertShow( List<AddToCart> AllOrder)
    {
        Double Price = 0.0;
        // ViewAllOrderUi ViewAllOrderUi  = new ViewAllOrderUi(AllOrder);
        for (AddToCart makePayment : AllOrder) {
            System.out.println("Name:" + makePayment.getName() + "\\t" + "code:" + makePayment.getPhonenumber() + "\\t"
                    + "Price:" + makePayment.getPrice() + "\\t");
            Price += makePayment.getPrice();
        }
        System.out.println("the Total Price :" + Price);
        // ViewAllOrderUi.setVisible(true);
        // ViewAllOrderUi.pack();
    
        // Employee Employee = new Employee();
        // Employee.Menu(DataBase);
    }
   
    
}
