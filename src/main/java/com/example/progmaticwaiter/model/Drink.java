package com.example.progmaticwaiter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Drink {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int quantity;

    private double price;

    @ManyToOne
    private SumOrder sumOrder;

    public Drink() {
    }

    public Drink(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Drink(String name, int quantity, double price, SumOrder sumOrder) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.sumOrder = sumOrder;
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

    public SumOrder getSumOrder() {
        return sumOrder;
    }

    public void setSumOrder(SumOrder sumOrder) {
        this.sumOrder = sumOrder;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", sumOrder=" + sumOrder +
                '}';
    }
}
