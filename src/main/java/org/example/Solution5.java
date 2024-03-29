package org.example;

class Solution5 {

    public String longestPalindrome(String s) {
        int i,j,left,right;
        int len = s.length();
        int max = 0;
        int temp;
        int tl,tr;
        StringBuilder sb = new StringBuilder();
        String ns = null;
        for (i = 0; i < len; i++) {
            if (max > len - i) {
                break;
            }
            //判断(i,len-1)是否存在回文
            for (j = len - 1; j >= i; j--) {
                right = j;
                left = i;
                //从(len-1)递减找相同字母
                while (left < right) {
                    if (s.charAt(right) == s.charAt(i)) {
                        break;
                    }
                    right--;
                }
                //找到

                tl = left;tr = right;
                while (left < right) {
                    left++;right--;
                    if(s.charAt(left) != s.charAt(right)) {
                        break;
                    }
                }
                if (left < right) {
                    continue;
                }
                temp = tr - tl;
                if (temp >= max) {
                    max = temp;
                    sb = new StringBuilder();
                    for (int k = tl; k <= tr; k++) {
                        sb.append(s.charAt(k));
                    }
                    ns = sb.toString();
                }
            }
        }
        return ns;
    }
}