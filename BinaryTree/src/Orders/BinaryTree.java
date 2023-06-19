package Orders;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData
	 *            the data for the root
	 */
	public BinaryTree(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 *
	 * @param rootData
	 *            the data for the root
	 * @param left
	 *            the left subtree
	 * @param right
	 *            the right subtree
	 */
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 *
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 *
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 *
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		BinaryTree<E> result = new BinaryTree<>();
		result.root = root.right;
		return result;

	}

	/**
	 *
	 * @param rootData
	 *            the new data for the root
	 *
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {

		E olddata = root.data;
		root.data = rootData;
		return olddata;

	}

	/**
	 *
	 * @param n
	 * @return true in n has no children
	 */
	private boolean isLeaf(Node n) {

		return n.left == null && n.right == null;
	}

	/**
	 *
	 * @param n
	 * @return true in n has at least one child
	 */
	private boolean isInternal(Node n) {

		return n.left == null || n.right == null;
	}

	/**
	 *
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	private int size(Node n) {
		int count = 0;
		if (n != null) {
			count++;
			count += size(n.left);
			count += size(n.right);
		}
		return count;
	}

	public void inorder(){
		inorder(root);
	}
	private void inorder(Node n){
		if (n != null){
			inorder(n.left);
			System.out.println(n.data);
			inorder(n.right);
		}
	}

	public void preorder(){
		preorder(root);
	}
	private void preorder(Node n){
		if (n != null){
			System.out.println(n.data);
			preorder(n.left);
			preorder(n.right);
		}
	}

	public void postorder(){
		postorder(root);
	}
	private void postorder(Node n){
		if (n != null){
			postorder(n.left);
			postorder(n.right);
			System.out.println(n.data);
		}
	}

	private int sum ( Node n){
		int sum = 0;
		if (n != null){
			sum += sum(n.left);
			sum += sum(n.right);
			sum = (int) n.data;
		}
		return sum;
	}


	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
