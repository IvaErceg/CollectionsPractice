package com.CalcEngine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Product phone = new Product("Iphone 7", 10);
        Product computer = new Product("Intel i5 processor", 50);
        Product console = new Product("Playstation 4", 25);
        Product laptop = new Product("Acer", 30);
        Collection<Product> products = new ArrayList<Product>();
        products.add(phone);
        products.add(computer);
        products.add(console);
        products.add(laptop);
        //for each is replacement for iterator
        final Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getWeight() > 25) {
                System.out.println(product.getName());
            } else {
                /*with iterator we can remove elements while iterating through collection,
                with for each loop we get ConcurrentModificationException
                 */
                iterator.remove();
            }
        }

        System.out.println(products.size());
        products.remove(phone);
        System.out.println(products.size());
        System.out.println(products.contains(computer));
        products.clear();
        System.out.println(products.size());
        System.out.println(products.contains(laptop));

    }
}