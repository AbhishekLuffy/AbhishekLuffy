class InsertAt {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        int pos = 2;  // Position to insert (0-based index)
        int x = 9;    // Element to insert

        // Create a new array with increased size
        int newArr[] = new int[n + 1];

        // Copy elements up to position
        for (int i = 0; i < pos; i++) {
            newArr[i] = a[i];
        }

        // Insert new element
        newArr[pos] = x;

        // Copy remaining elements
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = a[i];
        }

        // Print the new array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
