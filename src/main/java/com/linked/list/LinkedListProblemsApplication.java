package com.linked.list;

import com.linked.list.problems.ListNode;
import com.linked.list.problems.MyLinkedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinkedListProblemsApplication {

	public static void main(String[] args) {

		SpringApplication.run(LinkedListProblemsApplication.class, args);

		MyLinkedList myList = new MyLinkedList();

		ListNode head = myList.createMyList();

		ListNode newHead = myList.insertFirst(head, 0);

		myList.display(newHead);

		ListNode last = myList.insertLast(newHead, 6);

		myList.display(last);


	}

}
