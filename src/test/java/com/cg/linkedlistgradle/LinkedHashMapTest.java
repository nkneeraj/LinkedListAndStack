package com.cg.linkedlistgradle;

import org.junit.Assert;
import org.junit.Test;

public class LinkedHashMapTest {

	@Test
	public void returnFrequency() {
		String sentence = "to be or not nott xyx to be" + "to be or not nott xyx to be" + "to be or not nott xyx to be";

		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value++;
			linkedHashMap.add(word, value);
		}
		int frequency = linkedHashMap.get("not");
		System.out.println(linkedHashMap);
		Assert.assertEquals(3, frequency);
	}
}