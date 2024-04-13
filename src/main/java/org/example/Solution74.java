package org.example;

public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l =-1, r = matrix.length;
        int i;
        int mid;
        while (l + 1 < r) {
            mid = (l + r) >>> 1;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        i = l < 0 ? r : l;
        l = 0;
        r = matrix[0].length;
        while (l + 1 < r) {
            mid = (l + r) >>> 1;
            if (matrix[i][mid] == target) {
                return true;
            } else if (matrix[i][mid] < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return false;
    }
}
