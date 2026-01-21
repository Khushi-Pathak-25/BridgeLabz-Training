package com.daynine.universitydigitalrecord;

public class StudentBST {

	StudentNode root;

	// Insert
	StudentNode insert(StudentNode root, int roll) {
		if (root == null)
			return new StudentNode(roll);

		if (roll < root.roll)
			root.left = insert(root.left, roll);
		else if (roll > root.roll)
			root.right = insert(root.right, roll);

		return root;
	}

	// Inorder Traversal (Sorted Output)
	void inorder(StudentNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.roll + " ");
			inorder(root.right);
		}
	}

	// Search
	boolean search(StudentNode root, int roll) {
		if (root == null)
			return false;
		if (root.roll == roll)
			return true;

		if (roll < root.roll)
			return search(root.left, roll);
		else
			return search(root.right, roll);
	}
}