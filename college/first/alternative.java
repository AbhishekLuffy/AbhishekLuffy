public class alternative {
    
    int max_even_odd(int a[], int n) {
        int max = 1, current = 1;

        for (int i = 1; i < n; i++) {
            if ((a[i] % 2 == 0 && a[i - 1] % 2 != 0) || (a[i] % 2 != 0 && a[i - 1] % 2 == 0)) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 1; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        alternative obj = new alternative();
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int n = a.length;
        
        int result = obj.max_even_odd(a, n);
        System.out.println("Max alternating even-odd subarray length: " + result);
    }
}
