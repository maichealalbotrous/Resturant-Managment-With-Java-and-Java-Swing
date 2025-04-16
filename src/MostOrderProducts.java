import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostOrderProducts implements opration{

    @Override
    public void Menu(DataBase DataBase) {
          List<AddToCart> AllMeal = DataBase.getOrderList();
        HashMap<String, Integer> namecount = new HashMap<>();


        for (AddToCart p : AllMeal) {
            if (namecount.containsKey(p.getName())) {
                
                namecount.put(p.getName(), namecount.get(p.getName()) + 1);
            } else {
                namecount.put(p.getName(), 1);
            }

    }

    for ( Map.Entry<String , Integer>name : namecount.entrySet()) {
        if(name.getValue()>3)
        {
            System.out.println("The Most Meal ordered :"+name.getKey());
        }  else if (name == namecount.entrySet().toArray()[namecount.size() - 1]) {
            System.out.println("there are no most ordred meal");
        }
    }
    
    // Employee Employee = new Employee();
    // Employee.Menu(DataBase);
}
}