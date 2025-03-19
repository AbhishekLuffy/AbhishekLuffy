public class ex_parameterizd {
    
    int a,b;
    ex_parameterizd(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor called");
    }
    void display(){
        System.out.println("value of a " + a);
        System.out.println("value of b " + b);

    }
    public static void main(String[] args) {
        ex_parameterizd ob = new ex_parameterizd(4, 8);
        ob.display();
    }
}
