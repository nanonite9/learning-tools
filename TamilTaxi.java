/* 
 * Filename: TamilTaxi.java
 * Author: nanonite9
 * Date: October 6, 2017 
 * Description: This program verifies Ramanujan's claim. User is asked for a number n and the program writes all integers less than or equal to n that can be expressed as the sum of two cubes in two ways.
 */

import java.util.Scanner;

public class TamilTaxi {
  public static void main(String args[]) {
    
    Scanner scan = new Scanner(System.in); // implements scanner
    
    // prompts user for a number
    System.out.println("Enter a number to receive all integers less\nthan or equal to n that can be expressed\nas the sum of two cubes in two different\nways (a^3 + b^3 = c^3 + d^3): ");
    int n = scan.nextInt(); // stores user input in n

    int a; // initializes variables in equation a^3 + b^3 = c^3 + d^3
    int b;
    int c;
    int d;
    int acubed; // initializes cubed values of variables
    int bcubed;
    int ccubed;
    int dcubed;

    for (a = 1; a <= n; a++) { // checks for a = 1, makes sure a is less than user input for n, ensures acubed is no greater than user input for n
      acubed = a * a * a; // equates acubed is the multiplication of a * a * a
      if (acubed > n) break;

      for (b = a; b <= n; b++) { // ensures sum of acubed and bcubed is no greater than user input for n
        bcubed = b * b * b;
        if (acubed + bcubed > n) break;

          for (c = a + 1; b <= n; c++) {
            ccubed= c * c * c;
            if (ccubed > acubed + bcubed) break; // ensures ccubed is no greater than the sum of acubed and bcubed

            for (d = c; d <= n; d++) {
              dcubed = d * d * d;
              if (ccubed + dcubed > acubed + bcubed) break; // ensures the sum of ccubed and dcubed is no greater than the sum of acubed and bcubed

              if (acubed + bcubed == ccubed + dcubed ) { // checks if RHS = LHS
                System.out.println("n = a^3 + b^3 = c^3 + d^3"); // prints n = a^3 + b^3 = c^3 + d^3
                System.out.println(n + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3"); // prints n = a^3 + b^3 = c^3 + d^3 with values used and obtained
              }
            }
          }
      }
    }
  }
}