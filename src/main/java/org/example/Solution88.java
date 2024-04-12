package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n == 0) {
            //do nothing
        } else {

            List<Integer> newNums = new ArrayList<>();

            int i = 0,j = 0;

            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    newNums.add(nums1[i]);
                    i++;
                } else {
                    newNums.add(nums2[j]);
                    j++;
                }
            }

            while (i < m) {
                newNums.add(nums1[i]);
                i++;
            }

            while (j < n) {
                newNums.add(nums2[j]);
                j++;
            }

            for (int k = 0; k < newNums.size(); k++) {
                nums1[k] = newNums.get(k);
            }
        }
    }
}
