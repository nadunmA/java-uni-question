import java.util.PriorityQueue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        PriorityQueue <String> pq = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter title 1 by 1 after enter done");

        while (true) {

            String books = scanner.nextLine();

            if(books.equalsIgnoreCase("done")){
                break;

            }
            pq.add(books);
            
        }

        System.out.println("\nEnter you want remove title");
        String removeTitle = scanner.nextLine();
        boolean removed = pq.remove(removeTitle);

        if(removed){
            System.out.println("\nThe book "+ removeTitle + " sucessfully");
        }else{
            System.out.println("The book "+ removeTitle + " not found");
        }

        System.out.println("\nTotal Number of books : "+ pq.size());

        
        System.out.println("\nNow remaing books ");
        pq.forEach(book -> System.out.println(book));
    }
}
