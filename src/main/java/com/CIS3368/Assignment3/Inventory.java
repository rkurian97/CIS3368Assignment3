package com.CIS3368.Assignment3;

import javax.persistence.*;

@Entity
@Table(name= "Inventory")
public class Inventory {
    @Id
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "color")
    private String color;
    public Inventory(){

    }
    public Inventory(long id, String description, double price, String color) {
        this.id=id;
        this.description=description;
        this.price=price;
        this.color=color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
