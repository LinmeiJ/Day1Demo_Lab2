import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double length, width, perimeter, height, area;
		
		char userAnswer = 'Y';
		
		Scanner scnr = new Scanner(System.in);
		
		
		do {
			System.out.println("Please enter the length, width and heighth in order: ");

			length = scnr.nextDouble();
			width = scnr.nextDouble();
			height =scnr.nextDouble();
			
			perimeter = 2 * (length + width);	
			System.out.println("perimeter is: " + perimeter);

			area = length * width;
			System.out.println("area is: " + area);

			
			//calculate its volume
			double volume;
			volume =  length * width * height;
			System.out.println("volume is: " + volume);
			
			System.out.println("would you like to continue to do more calculation(Y/N): ");
			userAnswer = scnr.next().charAt(0);
			userAnswer= Character.toUpperCase(userAnswer);		
		} while(userAnswer == 'Y');
		
		System.out.println("Goodbye");		
		scnr.close();
	}
}
