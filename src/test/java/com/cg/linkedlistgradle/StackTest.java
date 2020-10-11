package com.cg.linkedlistgradle;

import org.junit.Assert;
import org.junit.Test;
public class StackTest {
	@Test
	public void given3NumberWhenAddedToStackShouldBeAddedToTop() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Stack stack = new Stack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.print();
		INode peek = stack.peak();
		Assert.assertEquals(thirdNode, peek);
		
	}
}
