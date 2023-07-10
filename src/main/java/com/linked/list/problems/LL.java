package com.linked.list.problems;

public class LL {

    public Node deleteAtIndex(Node head, int index) {
        Node cur = head;
        Node prev = head;
        int size = 0;
        cur = cur.next;
        size++;
        while(cur != null) {
            size++;


            if (size == index) {
               prev.next = cur.next;
                break;
            }

            prev = cur;
            cur = cur.next;
        }

        return head;

    }

    public Node deleteFirst(Node head) {

        Node temp = head;
        head = temp.next;
        return head;
    }

    public Node deleteLast(Node head) {

        Node current = head;
        Node prev = head;

        while(current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null;
        return head;

    }

    public Node insertAtIndex(Node head, int index, int val) {

        Node temp = head;

        insertAtIndexRecurssion(index, val, temp);

        return head;
    }

    private Node insertAtIndexRecurssion(int index, int val, Node current) {

        if (index == 1) {
            Node temp = current.next;
            Node newNode = new Node(val, temp);
            current.next = newNode;
            return current;
        }
        index--;
        insertAtIndexRecurssion(index, val, current.next);
        return current;
    }

    public Node insertInPosition(Node head, int index, int val) {

        Node current = head;
        Node prev = head;

        int pos = 1;

        while (current != null) {

            pos++;
            prev = current;
            current = current.next;

            if (pos == index) {
                Node newNode = new Node(val, current);
                prev.next = newNode;
            }
        }

        return head;
    }

    public Node insertFirst(Node head, int val) {
        Node newHead = new Node(val, head);
        return newHead;
    }

    public Node insertLast(Node head, int val) {

        Node temp = head;
        Node prev = head;
        while (temp != null) {

            prev = temp;
            temp = temp.next;

            if (temp == null) {
                prev.next = new Node(val);
            }
        }
        return head;
    }

    public Node createMyList() {

        Node n5 = new Node(5);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        Node head = n1;
        display(head);
        return head;

    }

    public void display(Node head) {
        Node current = head;
        System.out.println();

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
    }

}
