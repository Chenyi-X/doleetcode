package org.example;


import org.ds.ListNode;

public class SolutionM0204 {
    //找最大值
    public ListNode findMax (ListNode head, int x) {
        ListNode p = head;
        while (head.val != x) {
            if (head.next.val >= x) {
                p = head;
                break;
            }
            head = head.next;
        }
        return p;
    }

    public void insert (ListNode p, ListNode pre) {
        ListNode tp1,tp2;

        tp1 = pre.next;//被插入节点
        tp2 = p.next;//插入节点

        p.next = p.next.next;
        pre.next = tp2;
        tp2.next = tp1;

    }

    public ListNode partition(ListNode head, int x) {
        if (head == null) return head;

        //辅助头结点
        ListNode newhead = new ListNode(-100,head);

        ListNode pre = findMax(newhead,x);

        //遍历，找小于pre.val的结点，插入在pre后面。
        ListNode p = pre.next;
        while (p.next != null) {
            if (p.next.val < pre.next.val) {
                //插入操作
                insert (p,pre);
            } else {
                p = p.next;
            }

        }
        return head;
    }
}
