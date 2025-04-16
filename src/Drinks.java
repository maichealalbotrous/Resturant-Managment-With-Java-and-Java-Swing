public class Drinks extends Products implements opration {

    

    @Override
    public void Menu(DataBase DataBase) {
       
    }

  


    public String toString() {
        return name + "</N>" + price + "</N>" + String.join(",", Ingredient) + "</N>";
    }

    
}
