import java.util.HashMap;

class Product{

    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price){

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Name : " + name + ", Quantity : " + quantity + ", Price : " + price;
    }
}


public class App {

    private HashMap<String, Product> hm = new HashMap<>();

    public void addProduct(String code, String name, int quantity, double price){
        
        hm.put(code, new Product(name, quantity, price));
        System.out.println("Product added/updated : " + code);
    }

    public void removeProduct(String code){

        if(hm.remove(code) != null) System.out.println("Product removed : " +code);
        else System.out.println("Product not found : " +code); 
    }

    public void displayInventory(){

        hm.forEach((code, Product) -> System.out.println("Code : " + code + ", " + Product));

    }



    public static void main(String[] args) throws Exception {

        App im = new App();

        im.addProduct("P101", "Mackbook", 10, 275000);
        im.addProduct("P102", "I phone", 30, 3275000);
        im.addProduct("P103", "Vision Pro", 1, 100000);
        im.addProduct("P104", "Air Tag", 50, 90000);
        im.addProduct("P105", "I Mac", 5, 122000);

        System.out.println();

        im.displayInventory();

        System.out.println();

        im.removeProduct("P101");
        im.removeProduct("P105");

        System.out.println();

        im.displayInventory();
        
    
    }
}


/*b) Create  a Java program that manages the  inventory of products using  a HashMap.  The
program should allow user to add products, update their quantities, remove products, and
view the current inventory.

i) Create a HashMap to manage the inventory, where the keys are unique product
codes (strings) and the values are objects representing each product. Each product
object should include the product name (string), the quantity in stock (integer), and
the price per unit (a double)      
                                                                      
ii) Implement a method to add aproduct to the inventory. The method should take the
productcode,productname,quantity,andpriceperunitasparameters.Ifaproduct
with the same code already exists, update its details.          

iii) Create a method to remove a product from the inventory based on the product code.

c)   In the main method, create a sample inventory with  5 products,  and display the product
details. Then remove 2 products and display the remaining products again.*/
