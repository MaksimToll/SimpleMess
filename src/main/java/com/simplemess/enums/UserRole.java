package com.simplemess.enums;

import com.simplemess.entity.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserRole {

    @Id
    @GeneratedValue
    private Long id;

    private String role;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "name",nullable = false)
    private User user;

    public UserRole() {
    }

    public UserRole(String admin, User user) {
        this.role = admin;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
