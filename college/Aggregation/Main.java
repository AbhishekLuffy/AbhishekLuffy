package Aggregation;

public class Main {
    public static void main(String[] args) {
        Address ad = new Address("Bangalore", "Karnatake", "India");
        Employee em = new Employee("anup", 123, ad);
        em.display();
    }
}
