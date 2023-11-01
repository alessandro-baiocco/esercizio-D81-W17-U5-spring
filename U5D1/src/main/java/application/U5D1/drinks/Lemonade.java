package application.U5D1.drinks;

import application.U5D1.entities.MenuElement;

public class Lemonade extends MenuElement implements Drink {
    private String name;
    private double quantity;


    public Lemonade(int calories, double price , String name , double quantity) {
        super(calories, price);
        this.name = name;
        this.quantity = quantity;


    }
}
