import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Chick Meter !!!\n");
		
		// GOLDEN VALUES INPUT (BOY'S INPUT)
		
		System.out.println("Enter your golden values for a female body: ");
		
		System.out.print("Enter golden height (m): ");
		double gHeight = input.nextDouble();
		
		System.out.print("Enter golden weight (kg): ");
		double gWeight = input.nextDouble();
		
		System.out.print("Enter golden waist (cm): ");
		double gWaist = input.nextDouble();
		
		System.out.print("Enter golden bust (cm): ");
		double gBust = input.nextDouble();
		
		System.out.print("Enter golden hips (cm): ");
		double gHips = input.nextDouble();
		
		// VALUES INPUT (GIRL'S INPUT)
		
		System.out.println();
		System.out.println("Enter the values for your body: ");
		System.out.print("Enter height (m): ");
		double height = input.nextDouble();
		
		System.out.print("Enter weight (kg): ");
		double weight = input.nextDouble();
		
		System.out.print("Enter waist (cm): ");
		double waist = input.nextDouble();
		
		System.out.print("Enter bust (cm): ");
		double bust = input.nextDouble();
		
		System.out.print("Enter hips (cm): ");
		double hips = input.nextDouble();
		
		GValues gV = new GValues(gHeight, gWeight, gWaist, gBust, gHips);
		Chick c = new Chick(height, weight, waist, bust, hips);
		
		c.calcGrade();
		System.out.println("Points: " + c.getPoints());
		
		input.close();
	}
	
}
