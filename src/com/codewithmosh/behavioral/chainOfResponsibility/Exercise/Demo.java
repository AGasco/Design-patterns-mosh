package com.codewithmosh.behavioral.chainOfResponsibility.Exercise;

public class Demo {
    public static void show(){
        var qbwReader = new QbwReader(null);
        var numbersReader = new NumbersReader(qbwReader);
        var xlsReader = new XlsReader(numbersReader);

        var dataReader = new DataReader(xlsReader);
        dataReader.read("pepaso.psd");
    }
}
