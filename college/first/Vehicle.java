import java.util.Scanner;
public class Vehicle {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int v , w , tw , fw;
        
        System.out.print("Enter the number of vehicles: ");
        v = sc.nextInt();
        System.out.print("Enter the number of wheels: ");
        w = sc.nextInt();

        if(w % 2 != 0 || w < 2 * v || w > 4 * v){
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        fw = (w - (2 * v)) / 2;
        tw = v - fw;
        
        System.out.println("Number of two-wheelers: " + tw);
        System.out.println("Number of four-wheelers: " + fw);
        
        sc.close();
    }
}