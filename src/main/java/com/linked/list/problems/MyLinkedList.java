package com.linked.list.problems;

public class MyLinkedList {

    public ListNode insertFirst(ListNode head, int val) {
        ListNode newHead = new ListNode(val, head);
        return newHead;
    }

    public ListNode insertLast(ListNode head, int val) {

        ListNode temp = head;
        ListNode prev = head;
        while (temp != null) {

            prev = temp;
            temp = temp.next;

            if (temp == null) {
                prev.next = new ListNode(val);
            }
        }
        return head;
    }

    public ListNode createMyList() {

        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        ListNode head = n1;

        display(head);

        return head;

    }

    public void display(ListNode head) {
        ListNode current = head;
        System.out.println();

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

}
