public class FoodNotFoundException extends Exception {
    public FoodNotFoundException(String e) {
        super(e);
        System.out.println(e);
    }
}
