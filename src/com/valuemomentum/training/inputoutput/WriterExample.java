package com.valuemomentum.training.inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

 

public class WriterExample {
    public static void main(String[] args) {
        try {
        Writer w=new FileWriter("c:/demo/data.txt");
        String content = "She sells Sea shells in the Sea ";
        w.write(content);
        w.close();
        System.out.println("Data written");
        } catch(IOException e) {
        e.printStackTrace();
        }
        // TODO Auto-generated method stub

 

         }

 

}
 