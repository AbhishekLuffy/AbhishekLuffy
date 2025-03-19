public class Linearscan {
    public static void main(String[] args) {
        int [] a = {3,4,5,6,7,8};
        boolean value = true;

        for(int i = 0 ; i < a.length-1 ; i++){
            if(a[i] < a[i + 1]){
                 value = true;
            }
            else{
                 value = false;
            }
        }
        System.out.println(value);
    }
}
