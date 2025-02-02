package threrad;

public class Satellite implements Runnable{
	
	 @Override
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	        	
	            System.out.println("Satellite is observing");
	            
	            try {
	                Thread.sleep(500);  
	                
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

}
}
