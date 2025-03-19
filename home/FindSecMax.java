public class FindSecMax {
    public static void main(String[] args) {
        int [] a = {3,7,5,9,2};
        int max = a[0];
        int secmax = a[0] ;
        for(int i = 0 ; i < a.length-1 ; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        for(int i = 0 ; i<a.length-1 ; i++){
            if(a[i] > secmax && a[i] < max){
                secmax = a[i];
            }
        }
        System.out.println("Second max value : " + secmax);

    }
    
}
