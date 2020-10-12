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
		INode peak = stack.peak();
		Assert.assertEquals(thirdNode, peak);		
	}
	
	@Test
	public void stackPopTest() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		
		Stack stack = new Stack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		INode node = stack.pop();
		stack.print();
		Assert.assertEquals(secondNode, node);
	}
}
