import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 7, 8, 9, 10, 10, 10, 11, 12, 13, 13, 13};
        System.out.println(Arrays.toString(solve(nums, 13)));   // [11, 13]
        System.out.println(Arrays.toString(solve(nums, 4)));    // [-1, -1]
    }

    static int[] solve(int[] nums, int target) {
        int[] index = {-1, -1};
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) end = mid - 1;
            else start = mid + 1;
            if (nums[mid] == target) index[0] = mid;
        }

//      if index[0] is -1, then the element is not found, so no need to search for last index
        if (index[0] == -1) return index;

        start = 0;
        end = nums.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) start = mid + 1;
            else end = mid - 1;
            if (nums[mid] == target) index[1] = mid;
        }

        return index;
    }
}
