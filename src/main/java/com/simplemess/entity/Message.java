package com.simplemess.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User aoutor;

    public Message() {
    }

    public Message(String title, String text, User aoutor) {
        this.title = title;
        this.text = text;
        this.aoutor = aoutor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAoutor() {
        return aoutor;
    }

    public void setAoutor(User aoutor) {
        this.aoutor = aoutor;
    }

}
