package application.U5D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends MenuElement {
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
