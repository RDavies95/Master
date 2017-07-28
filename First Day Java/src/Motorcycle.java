
public class Motorcycle extends Vehicle {

	int seats;
	String protectiveGear;
	Boolean seatBelt;
	
	
	
	
	public Motorcycle(int id,String name, String colour, int speed,int price ,int seats, String protectiveGear, Boolean seatBelt) {
		super(id,name, colour, speed, price);
		this.seats = seats;
		this.protectiveGear = protectiveGear;
		this.seatBelt = seatBelt;
		// TODO Auto-generated constructor stub
	}
	
	public static void DisplayMotorcycle(Motorcycle m)
	{
		String s = "ID = " + m.id + " Name = " + m.name + " Colour = " + m.colour + " Speed = " + m.speed + " Price = " + m.price + " Seats = " + m.seats + " Protective Gear = " + m.protectiveGear;
		System.out.println(s);
	}

	
	
	
}
