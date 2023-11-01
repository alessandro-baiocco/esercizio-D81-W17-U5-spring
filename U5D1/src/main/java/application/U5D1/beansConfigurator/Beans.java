package application.U5D1.beansConfigurator;

import application.U5D1.pizzas.Margerita;
import org.springframework.context.annotation.Bean;

public class Beans {
        @Bean
        Margerita margherita() {
        return new Margerita(1000 , 6.00 ,"margerita", null ,  false);
    }
}



