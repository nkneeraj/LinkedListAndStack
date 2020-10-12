package com.cg.linkedlistgradle;

public class Queue {
	private final LinkedList LinkedList;

	public Queue() {
		this.LinkedList = new LinkedList();
	}

	public void push(INode Node) {
		LinkedList.add(Node);
	}

	public void print() {
		LinkedList.addPrint();
	}

	public INode peak() {
		return LinkedList.head;
	}
	
	public INode pop()
	{
		return LinkedList.Pop();
	}

}
