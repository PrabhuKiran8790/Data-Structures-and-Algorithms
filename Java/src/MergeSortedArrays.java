/*
arr1 = [1, 2, 3, 0, 0, 0]
arr2 = [4, 5, 6]
m and n are number of non zero elements in both arrays
modify the first array and return it
 */

import java.util.Arrays;

public class MergeSortedArrays {
    static int[] solve(int[] arr1, int[] arr2, int m, int n) {
        int last = m + n-1;
        while (m > 0 && n > 0) {
            if (arr1[m-1] > arr2[n-1]) {
                arr1[last--] = arr1[m-1];
                m--;
            }
            else {
                arr1[last--] = arr2[n-1];
                n--;
            }
        }

        while (n > 0) {
            arr1[last--] = arr2[n-1];
            n--;
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(solve(arr1, arr2, 3, 3)));   // [1, 2, 3, 4, 5, 6]
    }
}
