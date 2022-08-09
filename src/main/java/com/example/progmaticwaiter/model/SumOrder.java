package com.example.progmaticwaiter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SumOrder {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "id")
    private List<Food> foods;

    @OneToMany(mappedBy = "id")
    private List<Drink> drinks;

    public SumOrder() {
        this.foods = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public SumOrder(List<Food> foods, List<Drink> drinks) {
        this();
        this.foods = foods;
        this.drinks = drinks;
    }

    public double getTotalPrice() {
        double sum = 0;

        for (Food food : this.foods) {
            sum += food.getPrice();
        }

        for (Drink drink : this.drinks) {
            sum += drink.getPrice();
        }

        return sum;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "SumOrder{" +
                "id=" + id +
                ", foods=" + foods +
                ", drinks=" + drinks +
                '}';
    }
}
