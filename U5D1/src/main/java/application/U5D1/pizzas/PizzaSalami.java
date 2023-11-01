package application.U5D1.pizzas;

import application.U5D1.entities.MenuElement;
import application.U5D1.toppings.Topping;

import java.util.List;

public class PizzaSalami extends MenuElement implements Pizza {
    private boolean xl;
    private List<Topping> toppings;
    private String name;


    public PizzaSalami(int calories, double price, String name , List<Topping> toppings , boolean xl) {
        super(calories, price);
        this.name = name;
        this.xl = xl;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza Salami " + (xl ? "xl " : " ") + toppings + " " + super.toString();
    }
}
