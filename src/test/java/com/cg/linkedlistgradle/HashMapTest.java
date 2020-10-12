package com.cg.linkedlistgradle;

import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {

	@Test
	public void returnWordFrequency() {
		String sentence = "to be or not nott xyx to be";
		HashMap<String, Integer> hashMap = new HashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = hashMap.get(word);
			if (value == null)
				value = 1;
			else
				value++;
			hashMap.add(word, value);
		}
		int frequency = hashMap.get("not");
		System.out.println(hashMap);
		Assert.assertEquals(1, frequency);
	}
}
