public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solve(nums));    // 6
    }

    static int solve(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for (int e: nums) {
            if (currentSum < 0) currentSum = 0;
            currentSum += e;
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
