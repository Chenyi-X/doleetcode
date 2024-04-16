package org.example;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        int index = s.lastIndexOf(' ');
        int end = s.length();
        if (index + 1 != s.length()) {
            return end - index - 1;
        }
        while (s.charAt(index) == ' ') {
            index--;
        }
        end = index + 1;
        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
        }
        return end - index - 1;
    }
}
