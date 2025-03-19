package Composition;

public class Car {
    private Engine engine; //composition
    Car(){
        engine = new Engine();
    }

    void startcar(){
        engine.start();
        System.out.println("car is starting");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.startcar();

    }
}
