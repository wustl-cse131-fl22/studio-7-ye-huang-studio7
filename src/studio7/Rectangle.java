package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5,6);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		r1.isSquare();
	}
	public Rectangle(double x, double y) {
	      length = x;
	      width = y;
	}
	public double area() {
		double area = length * width;
		return area;
	}

	public double perimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public void isSquare() {
		if (length == width) {
			System.out.print("is square");
		}else {
			System.out.print("is not square");
		}
	}
}

