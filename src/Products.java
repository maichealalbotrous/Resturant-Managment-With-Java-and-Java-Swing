class Products {
    String name;
    Double price;
    String[] Ingredient; 

    public Products() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String[] getIngredients() {
        return Ingredient;
    }

    public void setIngredient(String[] ingredients) {
        this.Ingredient = ingredients;
    }

    public String toString() {
        return name + "</N>" + price + "</N>" + String.join(",", Ingredient)+ "</N>";
    }

    
}