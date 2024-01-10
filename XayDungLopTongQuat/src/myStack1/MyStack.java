package myStack1;

public class MyStack {
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
	public Object peek() {
		return element[size-1];
	}
	public void push(Object type) {
		element[size] = type;
		size++;
	}
	public Object pop() {
		size--;
		return element[size];
	}
	public int getSize() {
		return size;
	}
	public int search(Object type) {
		for(int i=0;i<size;i++) {
			if(type == element[i]) {
				return i;
			}
		}
		return -1;
	}
}
