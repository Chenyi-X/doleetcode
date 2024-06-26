package org.example;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int l = -1, r = nums.length;
        int mid;
        while (l + 1 != r) {
            mid = (l + r) >>> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return r;

    }
}
