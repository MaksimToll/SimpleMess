package com.simplemess.entity;



import javax.persistence.*;

//import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import java.util.List;
import java.util.Set;


@Entity
public class User {
    public User() {
    }

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastName;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    List<Message> messages;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    Set<User> friends;

    public User(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;

    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }
}
