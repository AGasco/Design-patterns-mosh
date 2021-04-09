package com.codewithmosh.iterator.Exercise;

public class Demo {
    public static void show(){
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "PS5"));
        productCollection.add(new Product(2, "XBOX ONE X"));
        productCollection.add(new Product(3, "RTX NVIDIA 3070"));

        var iterator = productCollection.createIterator();
        while(iterator.hasNext()){
            var current = iterator.current();
            System.out.println(current.toString());
            iterator.next();
        }
    }
}
