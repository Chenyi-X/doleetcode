package org.example;

public class Solution162 {
    public int findPeakElement(int[] nums) {
        int l = -1, r = nums.length, mid;
        while (l + 1 < r) {
            mid = (l + r) >>> 1;
            if (mid - 1 < 0 && mid + 1 == nums.length)
                return mid;
            if (mid - 1 < 0) {
                if (nums[mid] > nums[mid + 1])
                    return mid;
            }
            if (mid + 1 == nums.length) {
                if (nums[mid] > nums[mid - 1])
                    return mid;
            }
            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) {
                l = mid;
            } else {
                r = mid;
            }
        }
        if (l < 0) return r;
        else if (r >= nums.length) return l;
        else return nums[l] > nums[r] ? l : r;
    }
}
