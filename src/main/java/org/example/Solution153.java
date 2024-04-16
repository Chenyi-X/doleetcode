package org.example;

public class Solution153 {
    public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1] || nums.length == 1) {
            return nums[0];
        }
        int l,r,mid,peak;
        l =  1;//指灰
        r = nums.length;//指色
        peak = 0;
        while (l < r) {
            mid = l + r;
            mid = mid >>> 1;
            if (nums[mid] > nums[peak]) {
                peak = mid;
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[peak + 1];
    }
}
