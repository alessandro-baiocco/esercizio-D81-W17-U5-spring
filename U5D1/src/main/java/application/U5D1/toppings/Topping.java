package application.U5D1.toppings;

import application.U5D1.entities.MenuElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Topping  {
    private String name;
    private double price = 0.50;

    @Override
    public String toString() {
        return " " + name + " ";
    }

    public Topping(String name) {
        this.name = name;
    }
}
