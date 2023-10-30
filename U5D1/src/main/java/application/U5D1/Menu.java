package application.U5D1;

import application.U5D1.entities.Drink;
import application.U5D1.entities.Pizza;
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

    Double grande(){
        return 1.50;
    }

    Double getPizzaPrice(){
        return rnd.nextDouble(6.50 , 9.00);
    }

    int getPizzaCalories(){
        return rnd.nextInt(1000 , 1200);
    }
    int getDrinkCalories(){
        return rnd.nextInt(20 , 200);
    }


    @Bean(name = "getMenu")
    List<Menu> getMenu(){
        List<Menu> menu = new ArrayList<>();
        menu.add(new Pizza("margherita" , getPizzaCalories() , 6.00));

        List<Topping> reMai = new ArrayList<>();
        reMai.add(getBacon());
        reMai.add(getHam());
        reMai.add(getSalami());
        List<Topping> salam = new ArrayList<>();
        salam.add(getSalami());
        menu.add(new Pizza(reMai ,"re maiale" ,getPizzaCalories(), getPizzaPrice()));
        menu.add(new Pizza(salam ,"salame" , getPizzaCalories() , getPizzaPrice()));
        menu.add(new Drink("coca cola media" , media() , getDrinkCalories()));
        menu.add(new Drink("coca cola grande" , grande() , getDrinkCalories()));

        return menu;

    }





}
