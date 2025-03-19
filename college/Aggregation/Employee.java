package Aggregation;

public class Employee {
    
    String name;
    int id;
    Address address;

    Employee(String name , int id, Address address){
        this.name=name;
        this.id=id;
        this.address=address;
    }

    void display(){
        System.out.println(name + " " + id);
        System.out.println(address.city);
        System.out.println(address.state);
        System.out.println(address.country);
    }
}
