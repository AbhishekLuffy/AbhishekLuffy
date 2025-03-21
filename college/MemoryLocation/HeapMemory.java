package MemoryLocation;

public class HeapMemory {
    
    String name;  // Instance variable stored in heap

    HeapMemory(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        HeapMemory obj1 = new HeapMemory("Heap Object"); // Allocated in heap
        obj1.display();
    }
}
