package application.U5D1.entities;


import application.U5D1.Menu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
public  class Pizza  extends Menu {
    private String name;
    private String tomato;
    private String mozzarella;
    private List<Topping> ingrediens;
    private int calories;
    private double price;

    public Pizza(String name , int calories ,  double price  ){
    this.name = name;
    this.tomato = "tomato";
    this.mozzarella = "mozzarella";
    this.ingrediens = null;
    this.calories = calories;
    this.price = price;
    }

    public Pizza(List<Topping> ingrediens , String name ,  int calories , double price ){
        this.name = name;
        this.tomato = "pomodoro";
        this.mozzarella = "mozzarella";
        this.ingrediens = ingrediens;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza " + name + "(" + tomato + " , " + mozzarella +  (this.ingrediens == null ? "" : " , " + ingrediens) + ")         " + calories + "        " + price + "$\n";
    }
}
