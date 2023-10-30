package application.U5D1.entities;

import application.U5D1.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Topping extends Menu {
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
