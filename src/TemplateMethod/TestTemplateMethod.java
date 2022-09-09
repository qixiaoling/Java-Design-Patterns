package TemplateMethod;

import javax.xml.crypto.Data;

public class TestTemplateMethod {
    //if you have multiple class that uses the same method, put them in the superclass;
    //Essence: Subclasses decide how to implement steps in an algorithm;
    //superclass may have the algorithm,(first read, then process, last save data) but subclass decide the specific implementations;

    public static void main(String[] args) {
        //You can 1: use subclass as ref type
//        ExcelFile obj1 = new ExcelFile();
//        obj1.readProcessandSave();
//
//        TextFile obj2 = new TextFile();
//        obj2.readProcessandSave();
        //You can 2: use superclass as ref type, result is the same
        DataProcessor obj3 = new ExcelFile();
        obj3.readProcessandSave();

        obj3 = new TextFile();
        obj3.readProcessandSave();

    }
}
