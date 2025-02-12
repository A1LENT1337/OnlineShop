package com.se2423.OnlineShop.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="items")

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;
    @Column(unique = true)
    private String name;
    private int price;

    public Item(String category, String name, int price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Item(){
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
