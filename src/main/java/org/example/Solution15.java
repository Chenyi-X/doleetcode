package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list1;

        Arrays.sort(nums);


        List<List<Integer>> list2 = new ArrayList<>();
        int i = 0, j, k;
        while (i < nums.length - 2) {
            j = i + 1;
            while (j < nums.length - 1) {
                k = j + 1;
                label1 :
                while (k < nums.length) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
//                        list1.sort( (Comparator.comparingInt(o -> o)));
//                        for (List<Integer> o :
//                             list2) {
//                            if(o.equals(list1)) {
//                                k++;
//                                continue label1;
//                            }
//                        }
                        list2.add(list1);
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        return list2;
    }
}
