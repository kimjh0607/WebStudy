package quiz;

public class Bicycle extends Vehicle{
	private int gearCount;
	
	Bicycle(int wheels, String color, int gearCount){
		super(wheels, color);
		this.gearCount=gearCount;
	}
	
	@Override
	public double getMaxSpeed() {
		return gearCount * 4;
	}
	
	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[] { //배열에 추가하는 방식
		new Car(4,"red",150),
		new Car(4,"blue",250),
		new Bicycle(2,"green",10),
		new Bicycle(2,"yellow",18)
		};
		
		for(Vehicle veh : v) {
			System.out.println("휠:"+veh.getWheels()+"색:"+veh.getColor()+"마력:"+veh.getMaxSpeed());
		}
		
	}
}
