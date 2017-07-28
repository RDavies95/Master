import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Intermediate {

	@SuppressWarnings("resource")
	public void IntermediateTasks() throws IOException, ClassNotFoundException {

		// Task 12 Blackjack

		int valueA = 21;
		int valueB = 18;
		int t12Results = Blackjack(valueA, valueB);
		System.out.println("Task12 " + t12Results);

		// Task 13 Unique Sum

		int value1 = 7;
		int value2 = 8;
		int value3 = 6;

		int sum = UniqueSum(value1, value2, value3);
		System.out.println("Task13 " + sum);

		// Task 14 Too Hot?

		int temp = 95;
		Boolean isSummer = true;

		Boolean bResult = TooHot(temp, isSummer);
		System.out.println("Task14 " + bResult);

		// Task 15 People

		ArrayList ar = new ArrayList();
		Person p1 = new Person("Rhys", 22, "QA");
		Person p2 = new Person("Riaz", 23, "QA");

		String p0info = p1.returninfo(p1.getName(), p1.getAge(), p1.getTitle());
		String p1info = p2.returninfo(p2.getName(), p2.getAge(), p2.getTitle());

		ar.add(p0info);
		ar.add(p1info);

		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i));
			System.out.print("\n");
		}

		// Task 16 Garage

		// create garage

		Garage g = new Garage();

		// Requirements for Car
		// String name, String colour, int speed, int wheels, String make
		Car c1 = new Car(1, "R8", "Black", 120, 1000, 4, "Audi");
		Car c2 = new Car(2, "Veyron", "Black", 220, 2500, 4, "Bugghati");
		Car c3 = new Car(3, "Corsa", "white", 520, 3500, 4, "Vauhxall");

		g.StoreVehicle(c1);
		g.StoreVehicle(c2);
		g.StoreVehicle(c3);

		// Requirements for Motorcycle
		// String name, String colour, int speed, int seats, String
		// protectiveGear, Boolean seatBelt
		Motorcycle m = new Motorcycle(4, "Ninja", "Green", 90, 500, 2, "helmet", false);
		Motorcycle m2 = new Motorcycle(5, "Bike", "blue", 100, 600, 2, "gloves", false);
		g.StoreVehicle(m);
		g.StoreVehicle(m2);

		// int id, String name, String colour, int speed, int price, int
		// engines, int seats

		Jet j = new Jet(6, "Jet", "Grey", 400, 4000, 2, 2);

		g.StoreVehicle(j);

		// list vehicles

		g.ListVehicles();

		System.out.println("\n");

		System.out.println("Display Vehicle Information");
		c1.DisplayCar(c1);
		c2.DisplayCar(c2);
		c3.DisplayCar(c3);
		m.DisplayMotorcycle(m);
		m2.DisplayMotorcycle(m2);
		j.DisplayJet(j);

		System.out.println("\n");

		System.out.println("Display Garage");

		g.ListVehicles();

		System.out.println("\n");

		// Removes car from garage

		System.out.println("Removes the second car from Garage");
		g.RemoveVehicle(c2.id);
		g.ListVehicles();
		System.out.println("\n");

		// Remove all cars from garage
		System.out.println("Removes all cars from garage");
		String car = "Car";
		g.RemoveType(car);
		g.ListVehicles();

		System.out.println("\n");

		// Deletes all Garage
		System.out.println("Removes everything from garage");
		g.EmptyGarage();
		g.ListVehicles();

		// Task 17
		// PAINT WIZARD

		ArrayList<Paint> storePaint = new ArrayList<Paint>();

		Paint cheapo = new Paint("CheapoMax", 20, 19.99, 10);
		Paint averageJoes = new Paint("AverageJoes", 15, 17.99, 11);
		Paint duluxourous = new Paint("DuluxourousPaints", 10, 25, 20);

		String paint1 = cheapo.OutputPaint(cheapo);
		System.out.println(paint1);
		storePaint.add(cheapo);
		String paint2 = averageJoes.OutputPaint(averageJoes);
		System.out.println(paint2);
		storePaint.add(averageJoes);
		String paint3 = duluxourous.OutputPaint(duluxourous);
		System.out.println(paint3);
		storePaint.add(duluxourous);

		System.out.println("Enter size of room: ");
		Scanner scanner = new Scanner(System.in);
		String size = scanner.nextLine();
		int sizeOfRoom = Integer.valueOf(size);
		System.out.println("Size of room " + sizeOfRoom);
		System.out.println("\n");

		String leastwaste = Calculations(sizeOfRoom, storePaint);
		System.out.println("Most Beneficial Paint = " + leastwaste);
		System.out.println("\n");

		String cheapest = Cheapest(sizeOfRoom, storePaint);
		System.out.println("Cheapest Paint = " + cheapest);
		System.out.println("\n");

		// Task 18
		// File Writing

		ArrayList<Person2> ar2 = new ArrayList<Person2>();

		Person2 person0 = new Person2("Rhys", "QA", 22);
		Person2 person1 = new Person2("Bob", "Boffin", 34);
		Person2 person2 = new Person2("Jamie", "Engineer", 67);
		Person2 person3 = new Person2("Ben", "Binman", 78);
		Person2 person4 = new Person2("Ralf", "Lawyer", 89);

		ar2.add(person0);
		ar2.add(person1);
		ar2.add(person2);
		ar2.add(person3);
		ar2.add(person4);

		for (int i = 0; i < ar2.size(); i++) {
			Person2 persontwo = ar2.get(i);
			String s = persontwo.toString();
			System.out.println(s);
			System.out.println("\n");

		}

		// Write all person to file
		writeAllToFile(ar2);
		
		//Reads in from file
		readInFromFile(ar2);
		
		
		
		
		
		
		

	}

	public int Blackjack(int a, int b) {
		int result = 0;
		int newa = 21 - a;
		int newb = 21 - b;

		if (a > 21 && b > 21) {
			result = 0;
		}

		if (newa > newb) {
			result = b;

		} else if (newb > newa) {
			result = a;
		}

		return result;
	}

	public int UniqueSum(int a, int b, int c) {
		int result = 0;

		if (a == b && b == c) {
			result = result + a;
		} else if (a == b) {
			result = c;
		} else if (a == c) {
			result = b;
			;
		} else if (b == c) {
			result = a;
		}

		else {
			result = a + b + c;
		}
		return result;
	}

	public Boolean TooHot(int temp, Boolean isSummer) {
		boolean result = false;

		if (temp > 60 && temp < 90 && isSummer == false) {
			result = true;
		} else if (temp > 60 && temp < 100 && isSummer == true) {
			result = true;
		}

		return result;

	}

	public String Calculations(int roomsize, ArrayList<Paint> paints) {
		String compname = "";

		int lowestcan = 100000;
		int numberoftins = 0;
		for (Paint p : paints) {

			int totalcoverage = p.litre * p.coverage;
			int temproomsize = roomsize;
			while (temproomsize > 0) {
				numberoftins = numberoftins + 1;
				temproomsize = temproomsize - totalcoverage;
			}

			if (numberoftins < lowestcan) {
				lowestcan = numberoftins;
				compname = p.paintName;
			}
			numberoftins = 0;

		}

		return compname;
	}

	public String Cheapest(int roomsize, ArrayList<Paint> paints) {
		String cheapestComp = "dd";

		int lowestcan = 100000;
		double priceTemp = 1000000000;
		int numberoftins = 0;
		for (Paint p : paints) {

			int totalcoverage = p.litre * p.coverage;
			int temproomsize = roomsize;
			while (temproomsize > 0) {
				numberoftins = numberoftins + 1;
				temproomsize = temproomsize - totalcoverage;
			}

			double price = numberoftins * p.cost;

			if (price < priceTemp) {
				cheapestComp = p.paintName;
			}

			numberoftins = 0;

		}

		return cheapestComp;
	}
	
	
	public void writeAllToFile(ArrayList ar2) throws IOException
	{
		for(int qw = 0; qw < ar2.size(); qw++)
		{
		Person2 persontwo = (Person2) ar2.get(qw);	
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\TaskFiles\\" + persontwo.pName);
		oos = new ObjectOutputStream(fout);
		oos.writeObject(persontwo);
		
		System.out.println("Wrote " + persontwo.pName + " to a file");
		}
	}
	
	public void readInFromFile(ArrayList ar2) throws IOException, ClassNotFoundException
	{
		for(int qw = 0; qw < ar2.size(); qw++)
		{
			Person2 persontwo = (Person2) ar2.get(qw);
			FileInputStream fin = null;
			ObjectInputStream ois = null;
			
			fin = new FileInputStream("C:\\Users\\Administrator\\Desktop\\TaskFiles\\" + persontwo.pName);
			ois = new ObjectInputStream(fin);
			persontwo = (Person2) ois.readObject();
			
			String s = persontwo.toString();
			System.out.println(s);
			System.out.println("\n");
			
			
			
			
		}
	}

}
