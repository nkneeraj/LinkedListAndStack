package com.cg.linkedlistgradle;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

public class LinkedListTest {
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {
		Node<Integer> firstNode = new Node<Integer>(1);
		Node<Integer> secondNode = new Node<Integer>(2);
		Node<Integer> thirdNode = new Node<Integer>(3);
		Node<Integer> fourthNode = new Node<Integer>(4);
		Node<Integer> fifthNode = new Node<Integer>(5);
		LinkedList list = new LinkedList();
		list.add(firstNode);   //UC1&UC2
//		list.add(secondNode);
//		list.add(thirdNode);

//		list.append(firstNode);  //UC3
		list.append(secondNode);
//		list.append(thirdNode);
//		list.addPrint();
		
		
//		list.addAtMid(firstNode);  //UC4
//		list.addAtMid(secondNode);
		list.addAtMid(thirdNode);
		list.addAtMid(fourthNode);
//		list.addAtMid(fifthNode);

		list.addPrint();
//		list.Pop();					//UC5
//		list.popLast();				//UC6
		INode search = list.search(4);  //UC7
		list.addPrint();
		
		list.insert(firstNode, fifthNode);		//UC8
		list.addPrint();
		
		boolean x = search.equals(fourthNode);
		assertTrue(x);
	}
}