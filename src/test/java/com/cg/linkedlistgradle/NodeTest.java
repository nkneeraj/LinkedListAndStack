package com.cg.linkedlistgradle;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

	@Test
	public void LinkedList()
	{
		Node<Integer> myFirstNode = new Node<>(1);
		Node<Integer> mySecondNode = new Node<>(2);
		Node<Integer> myThirdNode = new Node<>(3);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
							mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
