package com.zn.leetcode;

import java.util.Iterator;

public class TopKFrequentWords {

	public static class Map {
		public void map(String key, Document value, OutputCollector<String, Integer> output) {
			// Write your code here
			// Output the results into output buffer.
			// Ps. output.collect(String key, int value);
		}
	}

	public static class Reduce {

		public void setup(int k) {
			// initialize your data structure here
		}

		public void reduce(String key, Iterator<Integer> values) {
			// Write your code here
		}

		public void cleanup(OutputCollector<String, Integer> output) {
			// Output the top k pairs <word, times> into output buffer.
			// Ps. output.collect(String key, Integer value);

		}
	}
}

class OutputCollector<K, V> {
	public void collect(K key, V value) {

	}
	// Adds a key/value pair to the output buffer
}

class Document {
	public int id;
	public String content;
}
