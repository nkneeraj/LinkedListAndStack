package com.cg.linkedlistgradle;

import org.junit.Test;

import org.junit.Assert;

public class BinaryTreeTest {
	
	@Test
	public void addBinaryNodeTest() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		int size = binaryTree.getSize();
		Assert.assertEquals(3, size);
	}
}
