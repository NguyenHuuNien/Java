package btth03;

public class MainPersonTest {

	public static void main(String[] args) {
		Person p = new Person("HyuNie","Ha Noi");
		p.setAddress("NV-Ninh Binh");
		System.out.println(p.toString());
		Student st = new Student("Huu Nien", "Ninh Binh", "Test Person", 2004, 100000);
		st.setYear(2022);
		System.out.println(st.toString());
		Staff sf = new Staff("Hong Anh", "Ha Noi", "CDBKHN", 200000);
		sf.setAddress("VX-Ninh Binh");
		System.out.println(sf.toString());
	}

}
