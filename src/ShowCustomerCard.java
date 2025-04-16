public class ShowCustomerCard extends Thread{
   static DataBase DataBase = new DataBase();
    @Override
    public void run() {
        CustomerViewFoodUi customerViewFoodUi = new CustomerViewFoodUi();
        for (Products p : new DataBase().getProductscustomercard()) {
            System.out.println(p.getName());
            System.out.println(p.getPrice());
            customerViewFoodUi.addProductToOrderPanel(p);
        }
    }
    
  
}
