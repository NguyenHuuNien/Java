package mainCheck;

import myStack1.MyStack;

public class MainCheckStack {

	public static void main(String[] args) {
		myStack1.MyStack st1 = new MyStack(10);
		for(int i=0;i<10;i++) {
			st1.push(i);
		}
		System.out.println("peek st1 : " + st1.peek());
//		for(int i=0;i<10;i++) {
//			System.out.println(st1.pop());
//		}
		myStack2.MyStack<String> st2 = new myStack2.MyStack<String>(10);
		for(int i=0;i<10;i++) {
			st2.push("Nien " + i);
		}
		System.out.println("peek st2 : " + st2.peek());
//		for(int i=0;i<10;i++) {
//			System.out.println(st2.pop());
//		}
		System.out.println("index of 5 in st1: " + st1.search(5));
		System.out.println("index of 'Nien 6' in st2: " + st2.search("Nien 6"));
	}

}
