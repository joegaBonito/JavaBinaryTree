package DFS;

import java.util.Stack;

import main.Node;

public class DepthFirstSearchTreeStack {
	public void DFS(Node root) {
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while (s.isEmpty() == false) {
			Node x = s.pop();
			if(x.right!=null) s.add(x.right);
			if(x.left!=null) s.add(x.left);			
			System.out.print(x.data+" ");
		}
	}
}
