package org.example;

public class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = 0;
        int sum = 0;
        int i = 0,j;
        for ( j =  0; sum < target && j < nums.length; j++) {
            sum += nums[j];
            if (sum >= target) {
                minLength = j  + 1;
                break;
            }
        }

        if (minLength == 0) {
            return 0;
        }

        while (i < j && sum >= target) {

            //左边界
            while (sum >= target) {
                sum -= nums[i];
                i++;
            }
            if (minLength  > j - i  + 2) {
                minLength = j - i + 2;
            }

            //右边界
            while (sum < target && j < nums.length - 1) {
                j++;
                sum += nums[j];
            }
            if (minLength  > j - i + 1 && sum >= target) {
                minLength = j - i ;
            }
        }
        return minLength;
    }
}
