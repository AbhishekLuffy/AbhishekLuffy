package MemoryLocation;

public class Stack_m {

    int a;
    String s;
    Stack_m(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        
        Stack_m ob = new Stack_m();//reference stored in stack and object
        int a = 10; //stored in stack memory
        int b = 20; //stored in stack memory
        System.err.println(("a: "+a+" b: "+b));
    }
}
