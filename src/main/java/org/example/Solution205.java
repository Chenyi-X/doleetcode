package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        ladd(s, 0, list1, map);
        map.clear();
        ladd(t, 0, list2, map);
        return list1.equals(list2);
    }

    private void ladd(String s, int count, List<Integer> list1, Map<Character, Integer> map) {
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                list1.add(map.get(s.charAt(i)));
            } else {
                map.put(s.charAt(i), count);
                list1.add(count++);
            }
        }
    }
}
