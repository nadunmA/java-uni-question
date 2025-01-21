package Generics;

public class GenericsInventory {
	
	public <T extends Number> double calculateAverage(T[] numArr) {
		
		double total = 0;
		double count = 0;
		
		for(T element : numArr) {
			
			total = total + element.doubleValue();
			count ++;
		}
		double avg = total / count;
		return avg;
		
	}
	
	public <T extends Number> double calculateMinimum(T[] numArr) {
		
		double min = numArr[0].doubleValue();
		
		for(T element : numArr) {
			
			if(min > element.doubleValue()) {
				
				min = element.doubleValue();
				
			}
			
		}
		return min;
		
	}
	
	
	
	

}
