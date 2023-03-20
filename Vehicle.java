package quiz;

public abstract class Vehicle {
	private int wheels;
	private String color;
	
	public Vehicle(int wheels, String color) {
		this.wheels=wheels;//파라미터
		this.color=color;//파라미터
	}
		
	public abstract double getMaxSpeed();
	
	public int getWheels() {
		return wheels;
	}
	public String getColor() {
		return color;
	}
	
	
	
	
}
