package com.avinash.lc;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

//FIXME:
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode v1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        ListNode v2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l = addTwoNumbers(v1, v2);

        System.out.println(l.val);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
