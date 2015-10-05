package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlywaydemoApplication {

    @Autowired
    PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(FlywaydemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        this.repository.findAll().forEach(System.err::println);
        return (strings) -> System.err.println(this.repository.findAll());
    }
}
