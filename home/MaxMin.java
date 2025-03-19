class MaxMin{
    public static void main(String [] args){
        int [] a = {2,6,4,9,6};

        int max = a[0];
        int min = a[0];

        for(int i = 0 ; i < a.length-1 ; i++){
            if (a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("MAX :" + max);
        System.out.println("MIN :" + min);

    }
}