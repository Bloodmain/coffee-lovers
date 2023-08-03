package ru.dnk.coffeelovers.domain;

import jakarta.persistence.*;

@Entity
@Table
public class Message {
    @Id
    @GeneratedValue
    private long id;

    private String message;

    public Message() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
