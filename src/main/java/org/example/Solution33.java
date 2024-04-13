package org.example;

public class Solution33 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int l = 1,r = nums.length - 1;
        int mid;
        int peak = 0;
        if (nums[0] <= nums[nums.length - 1]) return searchB(nums, target, 0, nums.length - 1);
        else {
            while (l <= r) {
                mid = (l + r) >>> 1;
                if (nums[mid] > nums[peak]) {
                    l = mid + 1;
                    peak = l - 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return target < nums[0] ? searchB (nums, target, peak + 1, nums.length - 1) : searchB (nums, target, 0, peak);
    }
    private int searchB (int[] nums, int target, int l, int r) {
        int mid;
        while (l <= r) {
            mid = (l + r) >>> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
