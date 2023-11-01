package application.U5D1.drinks;


import application.U5D1.entities.MenuElement;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Drink  extends MenuElement {
    private String name;
    private double quantity;



    public Drink(String name, double quantity, int calories , double price) {
        super(calories , price);
        this.name = name;
        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return "bevanda " + name + " " + quantity + "L " + super.toString() + "\n";
    }
}
