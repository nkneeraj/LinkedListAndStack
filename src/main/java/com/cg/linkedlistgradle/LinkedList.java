package com.cg.linkedlistgradle;

public class LinkedList<K> {

	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	// add node at first
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

	// delete 
	public INode Pop() {
		if (head == null)
			return head;
		INode temp = head.getNext();
		head.setNext(temp);
		head = temp;
		return head;
	}
	
	public INode popLast() {
		if(head== null)
			return null;
		if(head.getNext()==null)
			return null;
		INode temp= head;
		while(temp.getNext().getNext()!=null) {
			temp= temp.getNext();
		}
		temp.setNext(null);
		return head;
			
	}

	// add at the end
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
		int mid = 0;
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
				mid = (int) Math.floor(length / 2);
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

	public INode<K> search(K key) {
		INode<K> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	
	public String toString()
	{
		return "LinkedList{"+head+"}";   //by default call the object class method.
	}
	
	//UC9
		public INode<K> deleteNodeWithKey(K key) {
			INode temp=head;
			while(temp!=null && temp.getNext().getKey()!=key)
				temp=temp.getNext();
			
			INode deleteNode=temp.getNext();
			temp.setNext(deleteNode.getNext());
			deleteNode.setNext(null);
			return deleteNode;
		}

	public int size() {
		INode<K> temp = head;
		int size=0;
		while(temp!=null)
		{
			temp=temp.getNext();
			size++;
		}
		return size;
	}
	
	public void insert(INode<K> preNode, INode<K> newNode) {
	
		INode<K> tempNode = preNode.getNext();
		preNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
}
