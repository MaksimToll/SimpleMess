package com.simplemess;

import com.simplemess.entity.User;
import com.simplemess.repository.UserRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class ConfigApp {
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(ConfigApp.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRespository respository) {
        return (args) -> {
            User user = new User("Anast", "Lot");
            respository.save(user);
            respository.save(new User("Maks", "Toll"));

            for (User user1: respository.findAll()){
                System.out.println( user.getName());
            }
        };
    }
}
