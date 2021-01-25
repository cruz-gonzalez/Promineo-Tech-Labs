
public class Week1Lab {

	public static void main(String[] args) {
		//create a variable to hold the quantity of available plane seats left on a flight
		int seatsOnPlane = 80;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 34.28;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'H';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean hotOutside = true;
		
		//create a variable to hold a customer's first name
		String customerFirstName = "Billy";
		
		//create a variable to hold a street address
		String streetAddress = "12345 W Hollywood Ln";
		
		//print all variables to the console
		System.out.println("Available seats left on the plane: " + seatsOnPlane);
		System.out.println(costOfGroceries + " is the cost of groceries.");
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("It is hot outside - " + hotOutside);
		System.out.println("The customer's first name is " + customerFirstName);
		System.out.println(streetAddress + "Is where the person lives.");
		
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		//seatsOnPlane = seatsOnPlane - 2;
		seatsOnPlane -= 2;
		System.out.println(seatsOnPlane);
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		//costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'C';
		System.out.println(middleInitial);
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		//hotOutside = false;
		hotOutside = !hotOutside;
		System.out.println(hotOutside);
		
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Bob";
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("This is an introduction to " + fullName + " who currently lives at " + streetAddress + ".");
		

	}

}
