import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MakePayment implements opration {
    String name;
    String code;
    LocalDate Date;
    Double price;


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getname() {
        return name;
    }

    public void setname(String price) {
        this.name = price;
    }

    @Override
    public void Menu(DataBase DataBase) {
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return   name + "</N>" + code + "</N>" + Date + "</N>" + price + "</N>";
    }

    
}
