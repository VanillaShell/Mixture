package dslearn.trees;

public class BiTreeNode<E> {
	private E data;
	private BiTreeNode<E> leftChild;
	private BiTreeNode<E> rightChild;

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public BiTreeNode<E> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BiTreeNode<E> leftChild) {
		this.leftChild = leftChild;
	}

	public BiTreeNode<E> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BiTreeNode<E> rightChild) {
		this.rightChild = rightChild;
	}
}
