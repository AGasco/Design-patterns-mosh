package com.codewithmosh.behavioral.chainOfResponsibility.Exercise;

public class XlsReader extends Handler{
    public XlsReader(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        if (filename.endsWith(".xls")){
            System.out.println("Reading data from an Excel spreadsheet.");
            return true;
        }
        return false;
    }
}
