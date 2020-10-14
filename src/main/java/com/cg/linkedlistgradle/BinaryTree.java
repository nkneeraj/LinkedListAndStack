package com.cg.linkedlistgradle;

public class BinaryTree<K extends Comparable<K>> {
	private BinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root,key);
	}

	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if(current==null)
			return new BinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult==0)
			return current;
		if(compareResult<0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}
	
	private boolean searchRecursive(BinaryNode<K> root, K key) {
		if (root == null) {
			return false;
		}
		int compared = root.key.compareTo(key);
		if (compared == 0)
			return true;
		else if (compared < 0)
			return searchRecursive(root.left, key);
		else
			return searchRecursive(root.right, key);
	}
	
	public int getSize(){
		return this.getSizeRecursive(root);
	}
	private int getSizeRecursive(BinaryNode<K> current) {
		return current == null ? 0:1 + this.getSizeRecursive(current.left)
									+ this.getSizeRecursive(current.right);
	}
}
