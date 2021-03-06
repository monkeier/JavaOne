//Eggs.java
//Chinkyung Choo
//02/22/2019

import java.text.DecimalFormat;
import java.util.Scanner;
class Eggs {

	
	static Scanner inputDevice = new Scanner(System.in);
	
	public static void main(String[] args) {
		int egg;
		
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		
		System.out.print("Enter number of eggs needed>> ");
		egg = inputDevice.nextInt();
		
		int dozen= (egg/12);
		int each= (egg%12);
		double sum= (dozen*3.25)+(each*0.45);
		
		System.out.println("You ordered " + egg + " eggs." + "That is " + dozen + 
				" dozen at $3.25 and " + (df.format(each)) + " at 45 cents each for a total of " + (df.format(sum)) + ".");	
		
		inputDevice.close();
	}    
}
