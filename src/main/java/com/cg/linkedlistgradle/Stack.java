package com.cg.linkedlistgradle;

public class Stack {
	private final LinkedList LinkedList;

	public Stack() {
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
