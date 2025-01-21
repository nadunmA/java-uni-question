package Generics;

public class InventoryManeger {

	public static void main(String[] args) {
		
		GenericsInventory ob1 = new GenericsInventory();
		GenericsInventory ob2 = new GenericsInventory();
	
		Integer[] intArr = {1,3,4,7,2};
		double avg1 = ob1.calculateAverage(intArr);
		double min1 = ob1.calculateMinimum(intArr);
		
		Double[] doubleArr = {5.5, 3.24, 1.28, 9.4, 10.01};
		double avg2 = ob1.calculateAverage(doubleArr);
		double min2 = ob1.calculateMinimum(doubleArr);
		
		System.out.println("Average value of array : "+avg1);
		System.out.println("Minimum vlaue of array : "+min1);
		
		System.out.println();
		
		System.out.println("Average value of array : "+avg2);
		System.out.println("Average value of array : "+min2);
		

	}

}

/*



b) Implement a Java program to demonstrate the use of generics in a class called
"GenericInventory". The program should accomplish the following tasks:

Define a generic method called "calculateAverage()" that takes an array of a
numeric data type (Integer, Double, Float) as input and calculates the average value
(05 marks)

[Hint: convert the array elements to double values using doubleValue() method]

Define another generic method called "calculateMinimum()" that takes an array
of a numeric data type (Integer, Double, Float) as input and displays the minimum
(05 marks)

Write another class called "InventoryManager" which contains the main method.
Create two objects from the "GenericInventory" class, where the first object
accepts an Integer type array for the above two methods, and the second object
accepts a Double type of array for the above two methods. Display the results using proper printing statements.
(05 marks)



 */