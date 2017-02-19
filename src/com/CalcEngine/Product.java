package com.CalcEngine;

/**
 * Created by Iva on 19.2.2017..
 */
public class Product {
    private String name;
    private int weight;
    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
