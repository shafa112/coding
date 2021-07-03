package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	
	private Node root;

	public static void main(String[] args) {
		
		Tree t = new Tree();
		t.root = new Node(1);
		t.root.left = new Node(2);
		t.root.left.right = new Node(4);
		t.root.right = new Node(3);
		t.root.right.left = new Node(5);
		t.root.right.left.right = new Node(7);
		t.root.right.right = new Node(6);
		
		
	/*	inOrder(t.root);
		System.out.println();
		preOrder(t.root);
		System.out.println();
		postOrder(t.root);
		System.out.println();
		levelOrder(t.root);
		System.out.println();
		PrintlevelOrder(t.root);
		
		System.out.println("height of tree :"+ t.height(t.root));
		t.search(t.root, 7);
		Node copyTree = copy(t.root);
		inOrder(copyTree);
		
		Tree bst = new Tree();
		int[] a = {3,10,1,6,14,8,4,7,13};
		bst.root=bst.createBst(bst.root, a);
		bst.inOrder(bst.root);
		System.out.println("\nbst root: "+bst.root.data);*/
		levelOrder(t.root);
		System.out.println();
		Node mroot = mirror(t.root);
		levelOrder(mroot);
		
	}
	
	private static Node mirror(Node root) {
		if(root==null) return null;
		Node newNode = new Node(root.data);
		if(root.right !=null)newNode.left = mirror(root.right);
		if(root.left !=null)newNode.right = mirror(root.left);
		return newNode;
	}

	private static void levelOrder(Node root) {
		if(root==null) return ;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node d = q.remove();
			System.out.print(d.data+" ");
			if(d.left!=null) q.add(d.left);
			if(d.right!=null) q.add(d.right);
		}
	}
	
	
	private static void PrintlevelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int count=0;
		int n=0;
		while(!q.isEmpty()) {
			Node d = q.remove();
			++count;
			if(d!=null) 
			{
				if(count==n)System.out.println();
				System.out.print(" "+d.data+" ");
				if(d.left!=null) q.add(d.left);
				else q.add(null);
				if(d.right!=null) q.add(d.right);
				else q.add(null);
			}
			if(d==null && count%2==0)System.out.println();
			n=n+2;
		}
	}

	private static Node createBst(Node root,int[] a) {
		for(int i=0;i<a.length;++i) {
			int data=a[i];
			if(root ==null) {
				root = new Node(data);
			}
			else {
				Node temp = root;
				Node prev = temp;
				while(temp!=null) {
					prev = temp;
					if(data<temp.data) temp = temp.left;
					else temp = temp.right;
				}
				if(data>prev.data) prev.right=new Node(data);
				else prev.left = new Node(data);
			}
		}
		return root;
	}

	private static Node copy(Node root) {
		if(root==null) return null;
		Node newNode = new Node(root.data);
		newNode.left = copy(root.left);
		newNode.right = copy(root.right);
		return newNode;
	}

	private void search(Node root, int data) {
		if(root!=null) {
			if(root.data==data) {
				System.out.println("found");
			}
			search(root.left, data);
			search(root.right, data);
		}
	}

	/*
	 * height of tree(= height of root node) :
	 * number of edges in longest path from root to leaf node
	 */
	private int height(Node root) {
		if(root == null) return 0;
		if(root.left==null && root.right==null) return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(1+leftHeight, 1+rightHeight);
	}

	//left right root
	private static void postOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			inOrder(root.right);
			System.out.print(root.data+" ");
		}
	}

	//root left right
	private static void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			inOrder(root.left);
			inOrder(root.right);
		}
	}

	// left root right
	private static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}

}
