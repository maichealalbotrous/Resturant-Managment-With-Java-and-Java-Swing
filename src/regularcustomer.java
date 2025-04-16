import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class regularcustomer implements opration {

    @Override
    public void Menu(DataBase DataBase) {
        List<MakePayment> Allpayment = DataBase.getAllThePayment();
        RegularCustomerUi regularCustomerUi = new RegularCustomerUi(Allpayment);
        regularCustomerUi.setVisible(true);
        regularCustomerUi.pack();
                
        HashMap<String, Integer> namecount = new HashMap<>();

        for (MakePayment p : Allpayment) {
            if (namecount.containsKey(p.getname())) {
                namecount.put(p.getname(), namecount.get(p.getname()) + 1);
            } else {
                namecount.put(p.getname(), 1);
            }
        }
        for (Map.Entry<String, Integer> name : namecount.entrySet()) {
            if (name.getValue() > 3) {
                System.out.println("Name:" + name.getKey() + "\\t" + "Number of visite:" + name.getValue());

                
            }
        }


        // Employee Employee = new Employee();
        // Employee.Menu(DataBase);
    }
}
