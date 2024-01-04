package btth04;

public class MovableCircle implements Movable{
	private int radius;
	private MovablePoint center;
	public MovableCircle() {}
	public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
		center = new MovablePoint(x,y,xSpeed,ySpeed);
	}
	@Override
	public void moveUp() {
		center.moveUp();
	}

	@Override
	public void moveDown() {
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		center.moveRight();
	}
	@Override
	public String toString() {
		return center.toString()+",radius="+this.radius;
	}

}
