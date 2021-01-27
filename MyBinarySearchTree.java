package com.sorting;

class Node {
	int data;
	Node left;
	Node right;

}

class BST {
	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;

	}

	public Node insert(Node node, int val) {
		if (node == null) {
			return createNewNode(val);
		}
		if (val < node.data) {
			node.left = insert(node.left, val);
		} else if (val > node.data) {
			node.right = insert(node.right, val);
		}
		return node;
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}

}

public class MyBinarySearchTree {
	public static void main(String[] args) {
		BST a = new BST();
		Node root = null;
		root = a.insert(root, 8);
		root = a.insert(root, 10);
		root = a.insert(root, 3);
		root = a.insert(root, 15);
		root = a.insert(root, 25);
		root = a.insert(root, 31);
		root = a.insert(root, 27);
		a.inorderRec(root);

	}

}
