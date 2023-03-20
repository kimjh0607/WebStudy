package quiz;

public class Car extends Vehicle{
	private double enginePower;
	
	Car(int wheels, String color, double enginePower){
		super(wheels,color);
		this.enginePower=enginePower;	
	}
	
	@Override
	public double getMaxSpeed() {
		return enginePower * 3;
	}
}
