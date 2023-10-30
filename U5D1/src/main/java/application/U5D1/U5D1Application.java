package application.U5D1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@Slf4j
public class U5D1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5D1Application.class, args);

		configMenu();



	}


	public static void configMenu(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);

		log.info("\n" + ctx.getBean("getMenu").toString());



	}

}
