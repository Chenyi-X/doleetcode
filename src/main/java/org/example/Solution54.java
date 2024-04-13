package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i = matrix.length;
        int j = matrix[0].length;
        int numsLength = i * j;
        int c = 0;
        int currentI, currentJ;
        List<Integer> list = new ArrayList<>();
        while (numsLength != 0) {
            currentI = c;
            currentJ = c;
            if (numsLength == 1) {
                list.add(matrix[currentI][currentJ]);
                break;
            }
            while (numsLength != 0 && currentJ < j - 1 - c) {
                list.add(matrix[currentI][currentJ]);
                numsLength--;
                currentJ++;
            }
            while (numsLength != 0 && currentI < i - 1 - c) {
                list.add(matrix[currentI][currentJ]);
                numsLength--;
                currentI++;
            }
            while (numsLength != 0 && currentJ > c) {
                list.add(matrix[currentI][currentJ]);
                numsLength--;
                currentJ--;
            }
            while (numsLength != 0 && currentI > c) {
                list.add(matrix[currentI][currentJ]);
                numsLength--;
                currentI--;
            }
            c++;
        }
        return list;
    }
}
