package com.linked.list;

import com.linked.list.problems.Node;
import com.linked.list.problems.LL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinkedListProblemsApplication {

	public static void main(String[] args) {

		SpringApplication.run(LinkedListProblemsApplication.class, args);

		LL myList = new LL();

		Node head = myList.createMyList();

		head = myList.insertFirst(head, 0);

		myList.display(head);
		head = myList.insertLast(head, 6);

		head = myList.insertInPosition(head, 2, 7);
		myList.display(head);

		head = myList.insertAtIndex(head, 2, 8);
		myList.display(head);

		head = myList.deleteFirst(head);
		myList.display(head);

		head = myList.deleteLast(head);

		myList.display(head);

		head = myList.deleteAtIndex(head, 3);
		myList.display(head);
	}

}
