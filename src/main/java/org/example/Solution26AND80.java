package org.example;

class Solution26AND80 {
    public int removeDuplicates(int[] nums) {
        int i = 1, j =  2;
        while (j < nums.length) {
            if (nums[j] != nums[i] || nums[j] == nums[i] && nums[j] != nums[i-1]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}