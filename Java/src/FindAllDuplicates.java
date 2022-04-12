/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and
each integer appears once or twice, return an array of all the integers that appears twice.
 */


import java.util.ArrayList;
import java.util.HashSet;

public class FindAllDuplicates {
    static ArrayList<Integer> solve(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int e: nums) {
            if (!seen.contains(e)) seen.add(e);
            else list.add(e);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 2};
        System.out.println(solve(nums));
    }
}
