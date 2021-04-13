package com.codewithmosh.behavioral.template;

public class Demo {
    public static void show(){
        new TransferMoneyTask().execute();
        new GenerateReportTask().execute();
    }
}
