package dslearn.linerlists;

public class ListSlinkedNode<T> {
	private T element;
	private ListSlinkedNode<T> next = null;

	public ListSlinkedNode() {
	}

	public ListSlinkedNode(T data) {
		element = data;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public ListSlinkedNode<T> getNext() {
		return next;
	}

	public void setNext(ListSlinkedNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return element.toString();
	}
}