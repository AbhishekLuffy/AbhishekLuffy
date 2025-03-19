public class Reverse {
    public static void main(String [] args){
        int [] a ={3,5,7,2,7,9,0};
        int i = 0 , j = a.length-1 , temp;

        while(i < j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for(i = 0 ; i < a.length-1 ; i++){
            System.out.println(a[i]);
        }
    }
}
