package application.U5D1.pizzas;

import application.U5D1.entities.MenuElement;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
@Getter
@Setter
public class Margerita extends MenuElement {
    private boolean xl;










    public Margerita(int calories, double price , boolean xl) {
        super(calories, price);
        this.xl = xl;
    }









}


//    @Bean
//    Pizza margherita() {
//        return new Pizza("margherita" ,1000, 6.00);
//    }
//}
