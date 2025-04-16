import java.util.List;

public class DailyPayment implements opration {

    @Override
    public void Menu(DataBase DataBase) {
        List<MakePayment> DailyPayment = DataBase.getDailypayment();
        // DailyPaymentEmployee Daily =   new DailyPaymentEmployee(DailyPayment);
        Double Price = 0.0;
        for (MakePayment makePayment : DailyPayment) {
            System.out.println("Name:" + makePayment.getname() + "\\t" + "code:" + makePayment.getCode() + "\\t"
                    + "Price:" + makePayment.getPrice() + "\\t");
            Price += makePayment.getPrice();
        }
        // Daily.setVisible(true);
        // Daily.pack();
        // System.out.println("the Total Price :" + Price);
        // Employee Employee = new Employee();
        // Employee.Menu(DataBase);
    }

}
