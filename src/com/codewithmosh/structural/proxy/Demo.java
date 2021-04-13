package com.codewithmosh.structural.proxy;

public class Demo {
    public static void show(){
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};

        for(var fileName: fileNames){
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("a");
    }
}
