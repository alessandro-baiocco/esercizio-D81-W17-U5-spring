package epicode.u5d1hw.entities;

import epicode.u5d1hw.entities.drinks.Drink;
import epicode.u5d1hw.entities.toppings.ToppingDecorator;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Menu {
    private final List<Food> menuPizza = new ArrayList<>();
    private final List<ToppingDecorator> menuTopping = new ArrayList<>();
    private final List<Drink> menuDrink = new ArrayList<>();

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.menuPizza.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.menuTopping.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.menuDrink.forEach(System.out::println);
        System.out.println();

    }
}
