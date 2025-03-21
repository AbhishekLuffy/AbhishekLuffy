package Collections.ArrayList;
import java.util.*;

public class Studend {
        
    
    String name;
    int age;

    public Studend(String name, int age) {
        this.name = name;
        this.age = age;
    }
     
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        ArrayList<Studend> list = new ArrayList<Studend>();
        list.add(new Studend("A", 20));
        list.add(new Studend("B", 21));
        list.add(new Studend("C", 22));
        list.add(new Studend("D", 23));
        list.add(new Studend("E", 24));
        list.add(new Studend("F", 25));
    }
}


