package genericQ;

public class Main {

	public static void main(String[] args) {
		
		//created 2 objects
		genericss<String, Integer> gen1 = new genericss<>("Test 1", 42);
		genericss<Double, String> gen2 = new genericss<>(3.14, "Test 2");
		
		System.out.println("Printing  First  Pair");
		System.out.println("First value : " + gen1.getFirst());
		System.out.println("Second value : "+ gen1.getSecond());
		
		System.out.println();
		
		System.out.println("Printing  Second  Pair");
		System.out.println("First  Pair : " + gen2.getFirst());
		System.out.println("Second value : " + gen2.getSecond());
		
	}

}
