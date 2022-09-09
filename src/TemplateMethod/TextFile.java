package TemplateMethod;

import javax.xml.crypto.Data;

public class TextFile extends DataProcessor {


    public void readData(){
        System.out.println("Read data from text file");
    }

    public void processData(){
        System.out.println("Process data from text file");
    }

}
