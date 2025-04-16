import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class AddToCart {
    List<Products> ProductsList = new ArrayList<>();;
    String OrderWay;
    Double Price;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    String phonenumber;

    public void addtoList(Products Products) {
        ProductsList.add(Products);
    }

    public AddToCart() {
    }

    public List<Products> getProductsList() {
        return ProductsList;
    }

    public void setProductsList(List<Products> productsList) {
        ProductsList = productsList;
    }

    public String getOrderWay() {
        return OrderWay;
    }

    public void setOrderWay(String orderWay) {
        OrderWay = orderWay;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return OrderWay + "</N>" + Price + "</N>" + name + "</N>" + phonenumber + "</N>" + ProductsList + "</N>";
    }

}
