package epicode.u5d1hw.config;

import epicode.u5d1hw.entities.Food;
import epicode.u5d1hw.entities.Menu;
import epicode.u5d1hw.entities.drinks.Drink;
import epicode.u5d1hw.entities.drinks.Lemonade;
import epicode.u5d1hw.entities.pizzas.PizzaMargherita;
import epicode.u5d1hw.entities.toppings.BufalaTopping;
import epicode.u5d1hw.entities.toppings.HamTopping;
import epicode.u5d1hw.entities.toppings.ToppingDecorator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    Menu getMenu(){
        Menu menu = new Menu();
        menu.getMenuPizza().add(getMargherita());
        menu.getMenuPizza().add(getMargheritaXL());
        menu.getMenuPizza().add(getProsciutto());
        menu.getMenuPizza().add(getBufala());
        menu.getMenuPizza().add(getBufalaCrudo());

        menu.getMenuTopping().add(getHamTopping());
        menu.getMenuTopping().add(getBufalaTopping());

        menu.getMenuDrink().add(getLemonade());
        return menu;
    }

    @Bean("margherita_normale")
    Food getMargherita(){
        return new PizzaMargherita("Margherita", false);
    }

    @Bean("margherita_xl")
    Food getMargheritaXL(){
        return new PizzaMargherita("Margherita XL", true);
    }

    @Bean("prosciutto_normale")
    Food getProsciutto(){
        return new HamTopping(new PizzaMargherita("Prosciutto", false));
    }

    @Bean("margherita_bufala_normale")
    Food getBufala(){
        return new BufalaTopping(new PizzaMargherita("Bufalina", false));
    }

    @Bean("margherita_bufala_crudo_normale")
    Food getBufalaCrudo(){
        return new HamTopping(new BufalaTopping(new PizzaMargherita("Bufala e Crudo", false)));
    }


    @Bean("lemonade")
    Drink getLemonade(){
        return new Lemonade();
    }

    @Bean("Prosciutto")
    ToppingDecorator getHamTopping(){ return new HamTopping();}

    @Bean("Bufala")
    ToppingDecorator getBufalaTopping(){ return new BufalaTopping();}


}
