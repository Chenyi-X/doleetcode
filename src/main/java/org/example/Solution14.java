package org.example;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLen = Integer.MAX_VALUE;
        for (String o: strs) {
            minLen = Math.min(minLen, o.length());
        }
        for (int i = 0; i < minLen; i++) {
            for (String o : strs) {
                if (o.charAt(i) != strs[0].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
