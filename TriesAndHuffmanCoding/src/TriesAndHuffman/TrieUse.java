package TriesAndHuffman;

public class TrieUse {

	public static void main(String[] args) {
		
		TriesImplementation t = new TriesImplementation();
		t.insert("NOTE");
		t.insert("AND");
		t.insert("AN");
		
		System.out.println(t.search("AND"));
		t.remove("AND");
		System.out.println(t.search("AND"));

	}

}
