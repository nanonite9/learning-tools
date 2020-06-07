/* 
 * Filename: PleaseVerify.java
 * Author: nanonite9
 * Date: October 6, 2017
 * Description: This program asks a user for a password and compares with default administrator and guest password. Up to 3 attempts.
 */
import java.util.Scanner;

public class PleaseVerify {
	static final String ADMIN_PASSWORD = "admin";
	static final String GUEST_PASSWORD = "guest";
	static final int ATTEMPTS = 3;

	public static void main(String args[]) {

		int attempts = ATTEMPTS; // initialize max password attempts, user input, accepted password
		String userPassword;
		Boolean pass = false;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to The Password Verifier\n--------------------------------");

		while (!pass && attempts > 0) { // allows user to enter password until passed or out of attempts, between 0 and ATTEMPTS (3)
			System.out.print("Please Enter the password (" + attempts + " attempt(s) left): ");
			userPassword = scan.next();
			
			if (userPassword.equals(ADMIN_PASSWORD)) {
				System.out.println("Verified as administrator!");
				pass = true; // denotes password as correct
			}
			
			else {
				if (userPassword.equals(GUEST_PASSWORD)) {
					System.out.println("Verified as guest!");
					pass = true; // denotes password as correct
				}
				
			else {
				System.out.println("Verification failed!"); // prints message when user input does not correspond to any password
				attempts--; // reduces attempts by 1
			}
			}
	}
		
	if (!pass) {
		System.out.println("All Verification attempts failed!"); // lets user know all attempts have failed
	}
	}
}