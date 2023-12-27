package baiThucHanh2;

public class GradeBook {
	private String courseName;
	public GradeBook() {}
	public GradeBook(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String name) {
		this.courseName = name;
	}
//	public void displayMassege() {
//		System.out.println("Welcome to GradeBook!");
//	}
	public void displayMassege() {
		System.out.println("Welcome to GradeBook!");
		System.out.println("Chao mung ban den voi khoa hoc " + this.courseName);
	}
	public static void main(String[] args) {
		GradeBook a =  new GradeBook("Lap trinh tu Zero den Hacker.");
		a.displayMassege();
	}
}
