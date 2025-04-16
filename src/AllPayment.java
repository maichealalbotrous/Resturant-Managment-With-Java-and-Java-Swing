import java.util.List;

public class AllPayment implements opration{
   
    @Override
    public void Menu(DataBase DataBase) {
    
    }
    public void AllpaymentShow( List<MakePayment> AllyPayment)
    {
        Double Price = 0.0;
        ViewAllPaymentUi ViewAllPaymentUi  = new ViewAllPaymentUi(AllyPayment);
        for (MakePayment makePayment : AllyPayment) {
            System.out.println("Name:" + makePayment.getname() + "\\t" + "code:" + makePayment.getCode() + "\\t"
                    + "Price:" + makePayment.getPrice() + "\\t");
            Price += makePayment.getPrice();
        }
        System.out.println("the Total Price :" + Price);
       ViewAllPaymentUi.setVisible(true);
       ViewAllPaymentUi.pack();
    
    }
   
    
}
