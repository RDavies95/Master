import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> store = new ArrayList<Vehicle>();


	public Garage() {

	}

	public void StoreVehicle(Vehicle h) {
		store.add(h);
	}

	public void ListVehicles() {
		for (int i = 0; i < store.size(); i++) {
			Vehicle v = store.get(i);
			System.out.print(v.getClass().getName());

			if (v.getClass().getName() == "Car") {

				int newprice = v.price * 2;
				System.out.println(" Cost Of Parking = £" + newprice);
			}
			if (v.getClass().getName() == "Motorcycle") {

				int newprice = v.price / 2;
				System.out.println(" Cost Of Parking = £" + newprice);

			}
			if (v.getClass().getName() == "Jet") {

				int newprice = v.price * 5;
				System.out.println(" Cost Of Parking = £" + newprice);

			}

		}
		// note finish garage when back
	}

	public void EmptyGarage() {
		store.clear();
		System.out.println("Garage is now empty");
	}

	public void RemoveVehicle(int id) {
		for (int j = 0; j < store.size(); j++) {
			Vehicle v = store.get(j);
			if (id == v.id) {
				store.remove(j);
			}
		}
	}

	public void RemoveType(String Type)
	{
		ArrayList<Vehicle> storeTemp = new ArrayList<Vehicle>();
		for(int k = 0; k < store.size(); k++)
		{
			Vehicle v = store.get(k);
			if(Type.equals(v.getClass().getName()))
					{
					}
			else
			{
				storeTemp.add(store.get(k));
			}
		}
		store = storeTemp;
	}
	
	
	
	

}
