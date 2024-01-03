package btUp_Down;

public class RobotCat extends Cat{
	private int batery;

	public RobotCat(int batery) {
		super();
		this.batery = batery;
	}

	public RobotCat() {
		super();
	}

	public int getBatery() {
		return batery;
	}

	public void setBatery(int batery) {
		this.batery = batery;
	}
	@Override
	public void talk() {
		System.out.println("Xin chào");
	}
}
