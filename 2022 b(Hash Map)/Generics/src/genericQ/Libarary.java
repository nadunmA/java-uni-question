package genericQ;

import java.lang.foreign.ValueLayout;
import java.util.HashMap;

public class Libarary {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Book<?,?>> BookList = new HashMap<>();
		
		Book<String, String> book1 = new Book<>("Harry Poter", "ISBN1234");
		BookList.put(1, book1);
		
		Book<String, Integer> book2 = new Book<>("Harry Poter", 1234);
		BookList.put(2, book2);
		
		
		for(int id : BookList.keySet()) {
			Book<?,?> value = BookList.get(id);
			
			System.out.println("Book ID is: "+ id + " and the ISBN is: "+value.getBookIsbn());
		}
	}
	
	
	
}
