package btUp_Down;

public class Cat extends Animal{
	private int age;
	private String color;
	private double height;
	public Cat() {
	}
	public Cat(int age, String color, double height) {
		super();
		this.age = age;
		this.color = color;
		this.height = height;
	}
	public Cat(String name, int age, String color, double height) {
		super(name);
		this.age = age;
		this.color = color;
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public void talk() {
		System.out.println("meo meo");
	}
}
