public class party {
    int maximum(int e[], int l[]) {
        int n = e.length;
        int max = 0, current = 0;
        for (int i = 0; i < n; i++) {
            current += e[i];
            current -= l[i];
            max = Math.max(max, current);
        }
        return max;
    }

    public static void main(String[] args) {
        int e[] = {7, 0, 5, 1, 3};
        int l[] = {1, 2, 1, 3, 4};
        
        party p = new party();
        int result = p.maximum(e, l);
        
        System.out.println("Maximum people at the party at any time: " + result);
    }
}
