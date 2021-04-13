package com.codewithmosh.behavioral.iterator;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;
    private Iterator iterator;

    public void push(String url){
        urls[count] = url;
        count++;
    }

    public String pop(){
        count--;
        return urls[count];
    }

    public Iterator createIterator(){
        return new ArrayIterator(this);
    }

/*    public class ListIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }
    }*/

    public class ArrayIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public boolean hasNext() {
            return index < history.count;
        }
    }
}
