package btUp_Down;

public class Duck extends Animal{
	private double weight;

	public Duck(double weight) {
		super();
		this.weight = weight;
	}

	public Duck() {
		super();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public void talk() {
		System.out.println("vít vít");
	}
}
