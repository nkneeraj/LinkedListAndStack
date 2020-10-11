package com.cg.linkedlistgradle;

public class LinkedList {

	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode Node) {
		if (this.tail == null) {
			this.tail = Node;
		}
		if (this.head == null) {
			this.head = Node;
		} else {
			INode tempNode = this.head;
			this.head = Node;
			this.head.setNext(tempNode);

		}
	}	
	public INode Pop()
	{
		if(head==null)
			return head;
		INode temp = head.getNext();
		head.setNext(temp);
		head = temp;
		return head;
	}

	public void append(INode Node) {
		if (head == null) {
			head = Node;
			return;
		}

		INode temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(Node);
		return;
	}

	public void addAtMid(INode Node) {
		INode temp = head;
		int mid=0;
		if (head == null) {
			head = Node;
			return;
		} else {
			int length = 0;
			while (temp != null) {
				length++;
				temp = temp.getNext();
			}
			if (length % 2 == 0)
				mid = length / 2;
			else {
//				length = length + 1;
				mid = (int)Math.floor(length / 2);
			}
		}
		temp = head;
		while (mid != 1) {
			temp = temp.getNext();
			mid--;
		}
		Node.setNext(temp.getNext());
		temp.setNext(Node);
	}

	public void addPrint() {
		if (head == null) {
			System.out.println("No node present");
			return;
		}
		INode temp = head;
		while (temp != null) {
			System.out.println(temp.getKey() + " X ");
			temp = temp.getNext();
		}
		return;
	}
}