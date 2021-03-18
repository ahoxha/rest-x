package org.hoxha.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "planets")
public class Planet {
    @Id
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
