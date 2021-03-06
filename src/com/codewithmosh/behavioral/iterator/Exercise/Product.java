package com.codewithmosh.behavioral.iterator.Exercise;

public class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Product{id=" + this.id + ", name='" + this.name + "'}";
    }
}
