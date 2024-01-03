package btUp_Down;

public class Mouse extends Animal{
	private double weight;

	public Mouse(double weight) {
		super();
		this.weight = weight;
	}

	public Mouse() {
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
		System.out.println("chít chít");
	}
}
