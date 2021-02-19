package com.geekbrains.spring.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

public class Product {
    private int id;
    private String title;
    private float cost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String color) {
        this.title = color;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Product(Integer id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Product() {
    }
}