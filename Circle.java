package quiz;

public class Circle extends Shape{
	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius=radius;//생성자 만들때 super쓰는법
	}
	
	public double getArea() { //새로운 변수 만들지 않고도 바로 리턴가능
		double result = Math.PI * radius * radius;
		return result;
		//return Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle("Red",10);//생성자 고려할 것
		System.out.println("반지름 : "+c.getRadius());
		System.out.println("넓이 : "+c.getArea());
		
	}
}
