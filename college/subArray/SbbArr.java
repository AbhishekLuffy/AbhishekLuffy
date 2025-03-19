package subArray;

import java.util.Arrays;

public class SbbArr {
    public static int[] subArr(int arr[], int n, int s) {
        int left = 0, sum = 0;

        for (int right = 0; right < n; right++) {
            sum = sum + arr[right];

            while (sum > s && left <= right) {
                sum = sum - arr[left];
                left++;
            }

            if (sum == s) {
                return new int[]{left + 1, right + 1};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int S = 33;
        int[] result = subArr(arr, arr.length, S);
        System.out.println(Arrays.toString(result));
    }
}
