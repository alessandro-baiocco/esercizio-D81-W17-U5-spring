package application.U5D1.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MenuElement {
    private int calories;
    private double price;

    public MenuElement(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }


    @Override
    public String toString() {
        return  calories + " " + price + "$\n";}
}
