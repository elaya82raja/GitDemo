
public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
System.out.println(array[4]+" " + "is the last array index.");

		int[] array2 = {1, 2, 3, 4, 6};
		
System.out.println(array2[0]+" "+"is the first index value for array variable.");	

//for loop
for (int i=0; i<array2.length; i++)
{
System.out.println(array2[i]);
}		

// array string
String[] fruits = new String[3];
fruits[0] = "Apple";
fruits[1] = "Grapes";
fruits[2] = "Orange";

System.out.println(fruits[2] +" "+ "is the last value for string array varible");

//for loop
for (int i=0; i<fruits.length; i++)
{
	System.out.println(fruits[i]);
}																				
	}

}
