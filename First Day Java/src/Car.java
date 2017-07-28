
public class Car extends Vehicle {

	int wheels;
	String make;
	
	public Car(int id,String name, String colour, int speed,int price ,int wheels, String make) {
		super(id,name, colour, speed, price);
		this.wheels = wheels;
		this.make = make;
	}
	
	



	public void DisplayCar(Car c)
	{
		String s = "ID = " + c.id + " Name = " + c.name + " Colour = " + c.colour + " Speed = " + c.speed + " Price = " + c.price + " Wheels = " + c.wheels + " Make = " + c.make;
		System.out.println(s);
	}
}
