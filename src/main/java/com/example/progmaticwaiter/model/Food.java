package com.example.progmaticwaiter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Food {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int quantity;

    private double price;

    private int tableNumber;

    public Food() {
    }

    public Food(Long id, String name, int quantity, double price, int tableNumber) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.tableNumber = tableNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
}
