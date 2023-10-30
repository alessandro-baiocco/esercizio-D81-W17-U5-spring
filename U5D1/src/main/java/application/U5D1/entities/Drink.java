package application.U5D1.entities;


import application.U5D1.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter

public class Drink  extends Menu {
    private String name;
    private double quantity;
    private int calories;
    private double price = 2.50;


    public Drink(String name, double quantity, int calories) {
        this.name = name;
        this.quantity = quantity;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "bevanda " + name + " " + quantity + "L " + calories +" " + price+"$"+ "\n";
    }
}
