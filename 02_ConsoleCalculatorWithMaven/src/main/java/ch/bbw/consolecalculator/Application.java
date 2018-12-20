package ch.bbw.consolecalculator;

import java.io.IOException;
/**
 * Console Calculator App
 * @author Janick Niederberger
 * @version 0.0.1
 */
import java.util.Scanner; 

public class Application {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int valueA = 0;
		int valueB = 0;
		int choice = 0;
		Scanner in = new Scanner(System.in); 
		
		do {	
			
			System.out.println("Console Calculator");
			System.out.println("==================");
			System.out.println("1: Addition");
			System.out.println("2: Subtraktion");
			System.out.println("3: Division");
			System.out.println("4: Beenden");
			System.out.println("==================");
			System.out.println("Wählen Sie eine Operation aus: ");
			
			choice = Integer.parseInt(in.nextLine());
			
	        switch(choice){ 
	        case 1: 
	            System.out.println("Geben Sie die erste Zahl ein:"); 
	            valueA = Integer.parseInt(in.nextLine());
	            System.out.println("Geben Sie die zweite Zahl ein:"); 
	            valueB = Integer.parseInt(in.nextLine());
	            System.out.println("==================");
	            System.out.println("Ergebnis: " + valueA + " + " + 
	    				valueB + " = " + calculator.summe(valueA, valueB));
	            System.out.println("==================");
	            break; 
	        case 2: 
	        	System.out.println("Geben Sie die erste Zahl ein:"); 
	            valueA = Integer.parseInt(in.nextLine());
	            System.out.println("Geben Sie die zweite Zahl ein:"); 
	            valueB = Integer.parseInt(in.nextLine());
	            System.out.println("==================");
	            System.out.println("Ergebnis " + valueA + " - " + 
	    				valueB + " = " + calculator.substraction(valueA, valueB)); 
	            System.out.println("==================");
	            break; 
	        case 3: 
	        	System.out.println("Geben Sie die erste Zahl ein:"); 
	            valueA = Integer.parseInt(in.nextLine());
	            System.out.println("Geben Sie die zweite Zahl ein:"); 
	            valueB = Integer.parseInt(in.nextLine());
	            System.out.println("==================");
	            System.out.println("Ergebnis " + valueA + " / " + 
	    				valueB + " = " + calculator.division(valueA, valueB));
	            System.out.println("==================");
	            break; 
	        case 4:
	        	System.exit(0);
	        	break;
	        default: 
	        	System.out.println("==================");
	            System.out.println("Geben Sie eine gültige Zahl ein"); 
	            System.out.println("==================");
	        } 
		} while(choice!=4);

	}
}
