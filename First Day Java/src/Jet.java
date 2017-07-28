
public class Jet extends Vehicle {

	int engines;
	int seats;
	
	
	public Jet(int id, String name, String colour, int speed, int price, int engines, int seats) {
		super(id, name, colour, speed, price);
		this.engines = engines;
		this.seats = seats;
	}
	
	
	public void DisplayJet(Jet j)
	{
		String s = "ID = " + j.id + " Name = " + j.name + " Colour = " + j.colour + " Speed = " + j.speed + " Price = " + j.price + " Engines = " + j.engines + " Seats = " + j.seats;
		System.out.print(s);
	}
	
	
}
