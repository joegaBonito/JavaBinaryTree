package main;


/* Class containing left and right child of current 
node and key value*/
public class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int item) {
		this.data = item;
		this.left = null;
		this.right = null;
	}
}
