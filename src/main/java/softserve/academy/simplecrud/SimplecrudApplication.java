package softserve.academy.simplecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplecrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplecrudApplication.class, args);

        System.out.println("It's work");
    }

}
