import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"uzytkownik", "uzytkownik.service", "aukcja.service", "kategoria.service", "obserwacjaAukcji.service", "ocenaTransakcji.service", "uzytkownik.dao.impl"})


public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);


    }


}
