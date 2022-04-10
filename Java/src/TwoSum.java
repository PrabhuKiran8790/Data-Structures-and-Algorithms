import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 7};
        System.out.println(Arrays.toString(solve(arr, 7)));     // [1, 2]
        System.out.println(Arrays.toString(solveViaHashMap(arr, 7)));   // [1, 2]
    }

    static int[] solve(int[] nums, int target) {
//        bruteforce solution
//        O(n^2)
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }
        return new int[] {-1, -1};
    }

    static int[] solveViaHashMap(int[] nums, int target) {
//      O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) return new int[] {map.get(diff), i};
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
