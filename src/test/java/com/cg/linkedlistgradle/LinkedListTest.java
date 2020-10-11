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
		list.add(firstNode);
//		list.add(secondNode);
//		list.add(thirdNode);

//		list.append(firstNode);
		list.append(secondNode);
//		list.append(thirdNode);
//		list.addPrint();
		
		
//		list.addAtMid(firstNode);
//		list.addAtMid(secondNode);
		list.addAtMid(thirdNode);
		list.addAtMid(fourthNode);
//		list.addAtMid(fifthNode);

		list.addPrint();
		list.Pop();
		System.out.println("Y");
		list.addPrint();
		
		boolean x = list.head.equals(fourthNode);
		assertTrue(x);
	}
}