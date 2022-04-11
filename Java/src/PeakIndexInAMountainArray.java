public class PeakIndexInAMountainArray {
    static int solve(int[] nums) {
        int start = 0, end = nums.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid+1]) start = mid + 1;
            if (nums[mid] > nums[mid+1]) end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(solve(nums));
    }
}
