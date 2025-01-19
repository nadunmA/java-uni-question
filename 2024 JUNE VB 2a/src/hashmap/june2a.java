package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class june2a {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter product detials one by one\n");
		
		while(true) {
			System.out.print("Product id : ");
			int pId = scanner.nextInt();
			
			System.out.print("Product quantity : ");
			int quantity = scanner.nextInt();
			
			if(pId == -99 && quantity == -99) {
				break;
			}
			hm.put(pId, quantity);
		
		}
		
		System.out.print("enter the you want remove product : \n\n");
		int removeId = scanner.nextInt();
		Integer removed = hm.remove(removeId);
		
		if(removed != null) {
			System.out.println("sucessfully removed "+ removed + " Product Id\n");
		}else {
			System.out.println("Not found "+ removed + "Product Id\n\n");
		}
		
		System.out.println("Total number of Product : "+hm.size());
		
		System.out.println("Remaining product\n");
		hm.forEach((key, value) -> System.out.println("Product Id : "+ key + "   Quantity : "+value));
		

	}

}




