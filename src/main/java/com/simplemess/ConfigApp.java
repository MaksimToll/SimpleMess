package com.simplemess;

import com.simplemess.entity.Message;
import com.simplemess.entity.User;
import com.simplemess.enums.UserRole;
import com.simplemess.repository.MessageRepository;
import com.simplemess.repository.UserRespository;
import org.hibernate.annotations.SourceType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class ConfigApp {
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(ConfigApp.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRespository userRespository, MessageRepository messageRepository) {
        return (args) -> {
            User user = new User("Anast", "Lot");
            user.setPassword("admin");
            user.setEmail("admin@mail.ua");
            User user2 = new User("Maks", "Toll");
            UserRole userRole = new UserRole("ADMIN", user );
            userRespository.save(user);
            userRespository.save(user2);

            for (User user1: userRespository.findAll()){
                System.out.println( user.getName());
            }
            List<Message> messages = new ArrayList<>();
            Message message1= new Message("testik", "Some Test Message", user);
            message1.setReceiver(user2);
            messages.add(message1);
            user.setMessages(messages);
            userRespository.save(user);
            for (User user1: userRespository.findAll()){
                System.out.println( user.getName());
            }
            System.err.println("--------------------------------------------------------------");
            List<Message> messageList = messageRepository.findByAoutorId(user.getId());
            messageList.forEach(a-> System.err.println(a));
        };
    }
}
