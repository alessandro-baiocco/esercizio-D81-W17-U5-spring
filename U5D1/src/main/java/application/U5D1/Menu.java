package application.U5D1;

import application.U5D1.drinks.Drink;
import application.U5D1.drinks.Lemonade;
import application.U5D1.entities.MenuElement;
import application.U5D1.pizzas.Margerita;
import application.U5D1.pizzas.Pizza;
import application.U5D1.pizzas.PizzaSalami;
import application.U5D1.toppings.Mozzarella;
import application.U5D1.toppings.Pomodoro;
import application.U5D1.toppings.Salame;
import application.U5D1.toppings.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Configuration
public class Menu {
    Random rnd = new Random();




    List<Topping> toppings = new ArrayList<>();

    @Bean
    boolean returnTrue(){
        return true;
    }

    @Bean
    @Primary
    boolean returnFalse(){
        return false;
    }


    @Bean
    Margerita margherita(boolean xl) {
        toppings.clear();
        toppings.add(new Mozzarella("mozzarella"));
        toppings.add(new Pomodoro("pomodoro"));
        double price = xl ? 7.00 : 6.00;

        return new Margerita(1000 , price ,"margerita", toppings ,  xl);
    }

    @Bean
    PizzaSalami pizzasalami() {
        toppings.clear();
        toppings.add(new Mozzarella("mozzarella"));
        toppings.add(new Pomodoro("pomodoro"));
        toppings.add(new Salame("salame"));

        return new PizzaSalami(1050 , 7.00 ,"salame", toppings ,  false);
    }

    @Bean
    Lemonade lemonade(boolean big){
        double price = big ? 3.00 : 2.00;
        double quantity = big ? 1.25 : 0.75;
        return new Lemonade(200 , price , "lemonade" ,  quantity);


    }

    @Bean(name = "getMenu")
    List<MenuElement> getMenu(){
        List<MenuElement> menu = new ArrayList<>();
        menu.add(margherita(returnFalse()));
        menu.add(margherita(returnTrue()));
        menu.add(pizzasalami());
        menu.add(lemonade(returnFalse()));
        menu.add(lemonade(returnTrue()));
        return menu;

    }











}
