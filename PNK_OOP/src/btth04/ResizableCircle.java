package btth04;

public class ResizableCircle extends Circle implements Resizable{

	public ResizableCircle(double radius) {
		this.radius = radius;
	}
	@Override
	public void resize(int percent) {
		this.radius = percent / 100.0;
	}
	@Override
	public String toString() {
		return "ResizableCircle["+super.toString()+"]";
	}

}
