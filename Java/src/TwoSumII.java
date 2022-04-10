import java.util.Arrays;


// Find pair of numbers that sum to a target (input array is sorted)

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 7, 8, 9};
        System.out.println(Arrays.toString(solve(nums, 7)));
    }

    static int[] solve(int[] nums, int target) {
        int i = 0, j = nums.length-1;

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) i++;
            if (sum > target) j--;
            if (sum == target) return new int[] {i, j};
        }
        return new int[] {-1, -1};
    }
}
