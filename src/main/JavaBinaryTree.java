package main;
import BFS.BreadthFirstSearchBinaryTree;
import BFS.BreadthFirstSearchBinaryTreeQueue;
import DFS.DepthFirstSearchTreeStack;


public class JavaBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		BreadthFirstSearchBinaryTree bfsbt = new BreadthFirstSearchBinaryTree();
		System.out.println("Binary-First-Search : ");
		bfsbt.printLevelOrder(root);
		System.out.println("");
		BreadthFirstSearchBinaryTreeQueue bfsbtq = new BreadthFirstSearchBinaryTreeQueue();
		System.out.println("Binary-First-Search (Queue): ");
		bfsbtq.printLevelOrder(root);
		System.out.println("");
		DepthFirstSearchTreeStack dfsts = new DepthFirstSearchTreeStack();
		System.out.println("Depth-First-Search (Stack): ");
		dfsts.DFS(root);
		System.out.println("");
	}
	 /* Print nodes at the given level */
    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

}
