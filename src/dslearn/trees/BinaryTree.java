package dslearn.trees;

import java.util.Iterator;

public interface BinaryTree<T> {
	public int size();
	public boolean isEmpty();
	public T root();
	public int height();
	
	public Iterator<T> preOrderTraverse();
	public Iterator<T> inOrderTraverse();
	public Iterator<T> postOrderTraverse();
	public Iterator<T> levelOrderTraverse();
}
