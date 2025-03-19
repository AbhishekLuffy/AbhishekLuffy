package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("any file name!!!");
        }
        catch(IOException e){
            System.out.println("file not found");
        }
    }
}
