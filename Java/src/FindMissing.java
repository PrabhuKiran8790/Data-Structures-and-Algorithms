public class FindMissing {
    static int solve(int[] nums) {
        int sum = 0;
        for (int e: nums) sum += e;
        int n = nums.length;
        return n*(n+1)/2 - sum;
    }

    static int solve2(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i];
            if (nums[i] < n && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else i++;
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j) return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 0};
        System.out.println(solve(nums));
        System.out.println(solve2(nums));
    }
}
