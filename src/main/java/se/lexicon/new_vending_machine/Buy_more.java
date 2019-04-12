
package se.lexicon.new_vending_machine;

import java.util.Scanner;

public class Buy_more {
	static Scanner in = new Scanner (System.in);

	
	public static boolean buyAgain(String answer) {
		VendingMachine vm = new VendingMachine(0);
		String upperCaseString = answer.toUpperCase();
 		switch(upperCaseString) {
 		case "Y":
 			System.out.println("Welcome ");
 			return true;
 		default:
			return false;
}
}
	
	public static String GetbuyAgainsAnswer() {
			return in.nextLine();
}

}
