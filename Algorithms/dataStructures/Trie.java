package dataStructures;

public class Trie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieNode root=new TrieNode();
		insert("hello", root);
		insert("hehe", root);
		System.out.println(search("hellooo", root));
	}
	public static void insert(String str,TrieNode root)
	{
		TrieNode cur=root;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int position=ch[i]-'a';
			if(cur.next[position]==null)
				cur.next[position]=new TrieNode();
			cur=cur.next[position];
			cur.count++;
		}
		cur.exist=true;
	}
	public static boolean search(String str,TrieNode root)
	{
		TrieNode cur=root;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int position=ch[i]-'a';
			if(cur.next[position]==null)
				return false;
			cur=cur.next[position];
		}
		return cur.exist;
	}
}
class TrieNode
{
	int count=0;
	TrieNode next[]=new TrieNode[26];
	boolean exist=false;
}