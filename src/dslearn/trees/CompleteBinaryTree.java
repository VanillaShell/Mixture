package dslearn.trees;

/*      1
 *    /    \
 *   2      3
 *  / \    /
 * 4   5  6
 */
public class CompleteBinaryTree<T> {
	private Object[] elements;
	private int rear = -1;
	private static final int default_init_capacity = 8;
	
	public CompleteBinaryTree() {
		this(default_init_capacity);
	}
	
	public CompleteBinaryTree(int capacity) {
		if(capacity < 0) capacity = default_init_capacity;
		elements = new Object[capacity];
	}
	
	public void add(T e) {
		if( rear + 1 >= elements.length) {
			expandSpace();
		}
		elements[++rear] = e;
	}

	private void expandSpace() {
		Object[] newCap = new Object[elements.length*2 + 1];// TODO
		for(int i=0; i<elements.length; i++) {
			newCap[i] = elements[i];
		}
		elements = newCap;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if(index < 1 || index > rear + 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return (T) elements[--index];
	}
	
	public int getParentIndex(int index) {
		if(index < 1 || index > rear + 1) {
			return -1;
		}
		return index == 1? 1:index/2;
	}
	
	public int getLChildIndex(int index) {
		//rear + 1为节点数n
		if(2*index > rear + 1) return -1;
		return index/2;
	}
	
	public int getRChildIndex(int index) {
		if(2*index > rear) return -1;
		return 2*index + 1;
	}
	
	public void remove() {
		if(rear > -1) rear--;
	}
}
