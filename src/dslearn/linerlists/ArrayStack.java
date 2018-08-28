package dslearn.linerlists;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>{
	
	private static final int default_init_size = 10;
	
//	private int size;//size = top +1
	private int top = -1;
	private Object[] elements;
	
	public ArrayStack() {
		elements = new Object[default_init_size];
	}
	
	public ArrayStack(int capacity) {
		if(capacity < 0) {
			capacity = default_init_size;
		}
		elements = new Object[capacity];
	}
	
	@Override
	public int getSize() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public void push(T e) {
		if( (top + 1) == elements.length ) {
			expandCapacity();
		}
		elements[++top] = e;
	}

	private void expandCapacity() {
		int newCapacity = elements.length + 10;//TODO
		elements = Arrays.copyOf(elements, newCapacity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		if(top <= -1) {
			throw new IndexOutOfBoundsException("stack is empty");
		}
		return (T) elements[top--];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		if(top <= -1) {
			throw new IndexOutOfBoundsException("stack is empty");
		}
		return (T) elements[top];
	}

}
