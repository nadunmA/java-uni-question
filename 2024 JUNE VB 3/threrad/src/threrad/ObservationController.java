package threrad;

public class ObservationController {

	public static void main(String[] args) {
		
		Thread telescopeThread = new Thread(new Telescope());
        Thread satelliteThread = new Thread(new Satellite());

  
        try {
            telescopeThread.start();
            telescopeThread.join();
            
            System.out.println();
            
            satelliteThread.start();
            satelliteThread.join();  
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nBoth observations begin again simultaneously:");
        
        Thread telescopeThread2 = new Thread(new Telescope());
        Thread satelliteThread2 = new Thread(new Satellite());
        
        telescopeThread2.start();
        satelliteThread2.start();

	}

}
