package application.U5D1;

import application.U5D1.drinks.Drink;
import application.U5D1.entities.MenuElement;
import application.U5D1.pizzas.Pizza;
import application.U5D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Configuration
public class Menu {
    Random rnd = new Random();
    @Bean
    Topping getBacon() {
        return new Topping("bacon");
    }
    @Bean
    Topping getHam() {
        return new Topping("prosciutto");
    }
    @Bean
    Topping getSalami() {
        return new Topping("salame");
    }
    @Bean
    Double media(){
        return 0.75;
    }
@Bean
    Double grande(){
        return 1.50;
    }
@Bean
    Double getPizzaPrice(){
        return rnd.nextDouble(6.50 , 9.00);
    }
@Bean
    int getPizzaCalories(){
        return rnd.nextInt(1000 , 1200);
    }
    @Bean
    int getDrinkCalories(){
        return rnd.nextInt(20 , 200);
    }
    @Bean
    Pizza getReMaiale() {
        List<Topping> reMai = new ArrayList<>();
        reMai.add(getBacon());
        reMai.add(getHam());
        reMai.add(getSalami());
        return new Pizza(reMai ,"re maiale" ,getPizzaCalories(), getPizzaPrice());
    }
    @Bean
    Pizza margherita() {
        return new Pizza("margherita" ,getPizzaCalories(), 6.00);
    }


    Pizza getPizzaSalami(){
        List<Topping> salam = new ArrayList<>();
        salam.add(getSalami());
        return new Pizza(salam ,"salame" , getPizzaCalories() , getPizzaPrice());
    }


    @Bean(name = "getMenu")
    List<MenuElement> getMenu(){
        List<MenuElement> menu = new ArrayList<>();
        menu.add(getReMaiale());
        menu.add(margherita());
        menu.add(getPizzaSalami());
        menu.add(new Drink("coca cola media" , media() , getDrinkCalories()));
        menu.add(new Drink("coca cola grande" , grande() , getDrinkCalories()));
        menu.add(getSalami());
        menu.add(getHam());
        menu.add(getBacon());

        return menu;

    }





}
