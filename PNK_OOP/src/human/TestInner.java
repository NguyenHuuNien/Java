package human;

public class TestInner {
	private int data = 20;
	class Inner{
		public void msg() {
			System.out.println("Data: " + data);
		}
	}
	public static void main(String[] args) {
		TestInner out = new TestInner();
		TestInner.Inner in = out.new Inner();
		in.msg();
		Inner2 q = new Inner2();
		q.msg2();
	}
	
}
class Inner2{
	public void msg2() {
		System.out.println("Data: "+ 10);
	}
}
