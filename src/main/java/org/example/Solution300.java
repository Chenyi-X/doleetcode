package org.example;

public class Solution300 {
//    public int lengthOfLIS(int[] nums) {
//        int maxLen = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int o = i;
//            int target;
//            int tempLen = 0;
//            while (o != -1) {
//                tempLen++;
//                target = nums[o];
//                o = search(nums, target, o, nums.length - 1);
//
//            }
//            if (tempLen > maxLen) maxLen = tempLen;
//        }
//        return maxLen;
//    }
//    private int search(int[] nums, int target, int l, int r) {
//        int mid;
//        r++;
//        int temp = r;
//        while (l < r) {
//            mid = (l + r) >>> 1;
//            if (nums[mid] < target) {
//                l = mid + 1;
//            } else if (true){
//                r = mid;
//            }
//        }
//        if (r == temp) return -1;
//        return l;
//    }
}
