import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    static int[] solve(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        int prod = 1;
        for (int i = nums.length-2; i > -1 ; i--) {
            prod *= nums[i+1];
            res[i] *= prod;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(solve(nums)));   // [24, 12, 8, 6]
    }
}
