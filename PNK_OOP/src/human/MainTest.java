package human;

import human.TestInner.Inner;

public class MainTest {

	public static void main(String[] args) {
		TestInner out = new TestInner();
		TestInner.Inner in = out.new Inner();
		in.msg();
		Inner2 q = new Inner2();
		q.msg2();
	}

}
