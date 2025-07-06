package thirdtrial;
import java.util.*;

public class thirdnew {
	
	public static void main(String[] args) {
		/*We will create a shopping cart
		 program where:
		 1) User will type in an item
		 2) User will set a price for that item
		 3) User will give a quantity for that item
		 4) And the program will output total cost*/
		// create a scanner object
		Scanner scanner = new Scanner(System.in);
		
		// ask the user for the item type
		System.out.println("What item would you like to buy? ");
		String item_type = scanner.nextLine(); // take string input as item type
		
		// ask user for item price
		System.out.println("What is the price for each? ");
		double price = scanner.nextDouble(); // take double input as price
		
		// ask user for quantity
		System.out.println("How many would you like? ");
		int quantity = scanner.nextInt();
		
		// Print item quantity and type
		System.out.println("You have bought " + quantity + " " + item_type + "/s");
		
		// Print total cost
		System.out.println("Your total is $" + quantity*price);
		
		scanner.close();
	}
}
