package mission.q16;

public class Circle extends Shape {
	private double radius;

	// 생성자
//	public Circle() {
//	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	double round() {
		return 2 * Math.PI * this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
