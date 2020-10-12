package com.cg.linkedlistgradle;

public class MapNode<K, V> implements INode<K> {

	K key;
	V value;
	MapNode<K, V> next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public MapNode<K, V> getNext() {
		return next;
	}

	public void setNext(INode<K> next) {
		this.next = (MapNode<K, V>)next;
	}

	@Override
	public String toString() {
		StringBuilder MapNodeString =  new StringBuilder();
		MapNodeString.append("MapNode{"+"K=").append(key)
		.append(" V=").append(value).append('}');
		if(next!=null)
			MapNodeString.append("->").append(next);
		return MapNodeString.toString();
	}
}