package org.example;

public class Solution {

    public int shash (char a) {
        return a - 32;
    }

    public int lengthOfLongestSubstring(String s) {

        StrRecord sl = new StrRecord();
        int max = 0;
        int temp = 0;
        int len = s.length();

        char[] sa = s.toCharArray();

        for (int i = 0; i < len; i++) {
            if (max > len - i) {
                break;
            }
            for (int j = i; j < len; j++) {
                if (sl.find(shash(sa[j]))) {
                    break;
                } else {
                    temp++;
                }
            }
            if (temp > max) {
                max = temp;
            }
            temp = 0;
        }
        return max;
    }

    public static class StrRecord {
        private boolean[] s = new boolean[95];

        public StrRecord() {
            this.clear();
        }

        public void clear() {
            for (int i = 0; i < 95; i++) {
                this.s[i] = false;
            }
        }

        public boolean find(int i) {
            if (!s[i]) {
                s[i] = true;
                return false;
            } else {
                this.clear();
                return true;
            }
        }
    }
}
