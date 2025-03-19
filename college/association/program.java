package association;
public class program {
    String name;
    int age;
    program(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructor called");
    }
    void display(){
        System.out.println("name is " + name);
        System.out.println("age is " + age);

    }
    public static void main(String[] args) {
        program ob = new program("Unknown", 0);
        ob.display();
    }
}


