import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Kia");
		cars.add("Honda");
		cars.add("Nissan");
		cars.add("BMW");
		cars.set(0, "Tata");
		//for loop
		for (int i=0; i<cars.size(); i++)
		{
			System.out.println(cars.get(i));
		}
		System.out.println("***************");
		
		//Enhanced for loop
		for ( String val: cars)
		{
			System.out.println(val);


		}		
		System.out.println("***************");

		System.out.println(cars.contains("Nissan"));		

				
		}

}
