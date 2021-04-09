package com.codewithmosh.iterator.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList();


    public void add(Product product) {
        this.products.add(product);
    }

    public Product remove(Product product) {
        var index = products.indexOf(product);
        var removed = products.remove(index);
        return removed;
    }

    public ListIterator createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<Product>{
        private ProductCollection collection;
        private int index;

        public ListIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Product current() {
            return collection.products.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < collection.products.size();
        }
    }
}