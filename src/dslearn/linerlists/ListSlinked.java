package dslearn.linerlists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListSlinked<T> implements List<T> {

	private int size = 0;
	private final ListSlinkedNode<T> headSentinal = new ListSlinkedNode<T>();

	private ListSlinkedNode<T> getPreNode(int i) {
		ListSlinkedNode<T> p = headSentinal;
		for (; i > 0; i--) {
			p = p.getNext();
		}
		return p;
	}

	private ListSlinkedNode<T> getNode(int i) {
		ListSlinkedNode<T> p = headSentinal.getNext();
		for (; i > 0; i--) {
			p = p.getNext();
		}
		return p;
	}

	@Override
	public boolean add(T element) {
		ListSlinkedNode<T> temp = headSentinal;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(new ListSlinkedNode<T>(element));
		size++;
		return true;
	}

	@Override
	public void add(int pos, T element) {
		if (pos < 0 || pos > size) {
			throw new IndexOutOfBoundsException(
					new StringBuffer().append(pos).append(" is out of boundary.").toString());
		}
		ListSlinkedNode<T> p = getPreNode(pos);
		ListSlinkedNode<T> s = new ListSlinkedNode<T>(element);
		s.setNext(p.getNext());
		p.setNext(s);
		size++;
	}

	public void addAtFirst(T element) {
		ListSlinkedNode<T> p = new ListSlinkedNode<T>(element);
		p.setNext(headSentinal.getNext());
		headSentinal.setNext(p);
		size++;
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends T> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		ListSlinkedNode<T> p = headSentinal;
		ListSlinkedNode<T> s;
		while (p.getNext() != null) {
			s = p.getNext();
			p.setNext(null);
			p = s;
		}
		size = 0;
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int pos) {
		return getNode(pos).getElement();
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T set(int arg0, T arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public List<T> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		Object result[] = new Object[size];
		ListSlinkedNode<T> cur = headSentinal.getNext();
		int i = 0;
		while (null != cur) {
			result[i] = cur.getElement();
			cur = cur.getNext();
			i++;
		}
		return result;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void reverse1() {
		ListSlinkedNode<T> cur = headSentinal.getNext();
		headSentinal.setNext(null);
		ListSlinkedNode<T> next;
		while (null != cur) {
			next = cur.getNext();

			cur.setNext(headSentinal.getNext());
			headSentinal.setNext(cur);

			cur = next;
		}
	}

	public void reverse2() {
		if (size > 1) {
			ListSlinkedNode<T> opt, sub;
			sub = headSentinal.getNext();
			opt = sub.getNext();
			while (null != opt) {
				sub.setNext(opt.getNext());
				opt.setNext(headSentinal.getNext());
				headSentinal.setNext(opt);
				opt = sub.getNext();
			}
		}
	}

}