package org.example;

public class Solution125 {
    public boolean isPalindrome(String s) {
        String ns = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < ns.length()) {
            if (ns.charAt(index) >= '0' && ns.charAt(index) <= '9'
                    || ns.charAt(index) >= 'A' && ns.charAt(index) <= 'Z'
                    || ns.charAt(index) >= 'a' && ns.charAt(index) <= 'z') {
                sb.append(ns.charAt(index));
            }
            index++;
        }

        int i = 0, j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
}
