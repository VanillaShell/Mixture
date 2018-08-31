package dslearn.linerlists;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/*
 * 逻辑上的环形数组
 *  采用少使用一个储存单元的设计
 */
public class ArrayQueue<E> implements Queue<E>{
	
	private static final int default_init_capacity = 10;
	
	private Object[] elements;
	
	private int front, rear;
	
	public ArrayQueue() {
		this(default_init_capacity);
	}
	
	public ArrayQueue(int capacity) {
		if(capacity < 0) {
			capacity = default_init_capacity;
		}
		//对外表现的空间+内部实现需要的1个不使用的空间
		elements = new Object[capacity+1];
		front = rear = 0;
	}

	@Override
	public int size() {
		return (rear - front + elements.length)%elements.length;
	}

	@Override
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return (rear + 1) % elements.length == front;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		front = rear = 0;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offer(E e) {
		if(isFull()) return false;
		elements[rear] = e;
		rear = (rear + 1) % elements.length;
		return true;
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E poll() {
		if(isEmpty()) return null;
		E e = (E) elements[front];
		front = (front + 1) % elements.length;
		return e;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		if(isEmpty()) return null;
		return (E) elements[front];
	}

}
