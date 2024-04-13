package org.example;

public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1,-1};

        int start = search(nums, target, true);
        if (start == -1) {
            return new int[]{-1, -1};
        }
        if (start >= nums.length) {
            return new int[]{-1, -1};
        }
        if (nums[start] != target) {
            return new int[]{-1, -1};
        }
        int end = search(nums, target, false);
        return new int[]{start, end};
    }

    private int search (int[] nums, int target, boolean isStart) {
        int i = -1, j = nums.length, m;
        while (i + 1 != j) {
            m = (i + j) >>> 1;
            if (isStart && nums[m] < target){
                i = m;
            } else if (!isStart && nums[m] <= target){
                i = m;
            } else {
                j = m;
            }
        }

        return isStart ? j : i;
    }
}
