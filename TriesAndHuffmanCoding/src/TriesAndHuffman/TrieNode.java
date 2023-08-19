package TriesAndHuffman;

public class TrieNode {
	char data;
	boolean isTerminal;
	TrieNode childrenArr[]; //initialize an array of reference of the children
	int childCount;
	
	public TrieNode(char data) {
		this.data = data;
		this.isTerminal = false;
		this.childrenArr = new TrieNode[26]; // create an array size of 26 where the reference of the child will be stored
		this.childCount = 0;
	}
}
