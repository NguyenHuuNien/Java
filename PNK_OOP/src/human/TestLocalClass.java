package human;

public class TestLocalClass {

	private int data = 30;
	public void display() {
		class LocalClass{
			public void msg() {
				System.out.println("Data + 10 = " + (data+10));
			}
		}
		LocalClass lc = new LocalClass();
		lc.msg();
	}
	
	public static void main(String[] args) {
		TestLocalClass t = new TestLocalClass();
		t.display();
		t.data = 20;
		t.display();
	}

}
