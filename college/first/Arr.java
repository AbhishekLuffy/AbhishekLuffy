public class Arr {
    public static int addsubstring(int[]a){
        int count = 0;
        for(int i = 0 ; i<=a.length-4 ; i++){
            int temp = a[i] + a[i+1] + a[i +2];
            if(temp > count){
                count = temp;
            }
        }
        return count;
    }
    public static void main (String [] args){
        int a[] = {5,4,6,3,7,2};
        System.out.println(addsubstring(a));
    }
}