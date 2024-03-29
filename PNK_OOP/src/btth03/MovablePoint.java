package btth03;

public class MovablePoint extends Point{
	private float xSpeed = 0.0f;
	private float ySpeed = 0.0f;
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint() {}
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float[] getSpeed() {
		float[] speed = new float[2];
		speed[0] = this.xSpeed;
		speed[1] = this.ySpeed;
		return speed;
	}
	@Override
	public String toString() {
		String s = super.toString() + ", speed=("+this.xSpeed+","+this.ySpeed+")";
		return s;
	}
	public MovablePoint move() {
		super.setX(super.getX()+this.xSpeed);
		super.setY(super.getY()+this.ySpeed);
		return this;
	}
}
