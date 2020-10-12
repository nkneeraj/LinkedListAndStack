package com.cg.linkedlistgradle;

public class Queue<K> {
	private final LinkedList<K> LinkedList;

	public Queue() {
		this.LinkedList = new LinkedList<K>();
	}

	public void enqueue(INode<K> Node) {
		LinkedList.append(Node);
	}

	public void printQueue() {
		LinkedList.addPrint();
	}
	
	public int size() {
		return LinkedList.size();
	}
	
	public INode<K> deQueue()
	{
		return LinkedList.Pop();
	}

}
