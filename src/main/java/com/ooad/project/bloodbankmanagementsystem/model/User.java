package com.ooad.project.bloodbankmanagement.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "name")
    public String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {

    }
}