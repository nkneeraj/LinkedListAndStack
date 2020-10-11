package com.cg.linkedlistgradle;

public class Node<K> implements com.cg.linkedlistgradle.INode<K>
{

	private K key; // for private objects to access we need getters and setters.
	private INode next;

	public Node(K data) {
		this.key = data;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode getNext() {
		return next;
	}

//	public void setNext(Node next) {
//		this.next = next;
//	}

	@Override
	public void setNext(INode node) {
		this.next=node;
		
	}
}
