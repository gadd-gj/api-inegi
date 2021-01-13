package com.journaldev.rediscachedemo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 7156526077883281623L;

    @Id
    @SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_USER", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
    private Long id;
    private String name;
    private long password;

    public User() {
    }

    public User(String name, long password) {
        this.name = name;
        this.password = password;
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

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("User{id=%d, name='%s', password=%d}", id, name, password);
    }
}
