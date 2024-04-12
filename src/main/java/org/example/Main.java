package org.example;

import org.ds.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.convert("PAHNALIGYPISRI",3)); // 输出 true

        ListNode head = new ListNode(1,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(5,null)))));

        SolutionM0204 sm = new SolutionM0204();
        head = sm.partition(head,3);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}