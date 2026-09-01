package com.github.zia.singleton;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Example of Singleton Design Pattern
 */
public class Printer {

    private static Printer printer;
    private final FileOutputStream fileOutputStream;

    private Printer(){
        try {
        File file = new File("temp_msg.txt");
            file.createNewFile();
            fileOutputStream=new FileOutputStream(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Printer getInstance(){
        if(printer==null){
            printer=new Printer();

        }
        return printer;
    }

    public void printInfo(String string){
        try {
            fileOutputStream.write(("[Info] " +string).getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printError(String error){
        try {
            fileOutputStream.write(("[Error] "+ error).getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

