package myStack2;

public class MyStack<E> {
	private Object[] element;
	private int size = 0;
	public MyStack() {}
	public MyStack(int capacity) {
		element = new Object[capacity];
	}
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	public boolean isFull() {
		return size == element.length? true : false;
	}
	public E peek() {
		return (E)element[size];
	}
	public void push(E type) {
		element[size] = type;
		size++;
	}
	public E pop() {
		size--;
		return (E)element[size];
	}
	public int getSize() {
		return size;
	}
	public int search(E type) {
		for(int i=0;i<size;i++) {
			if(type == (E)element[i]) {
				return i;
			}
		}
		return -1;
	}
}
