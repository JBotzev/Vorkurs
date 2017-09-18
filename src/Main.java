import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Chick Meter !!!\n");
		
		System.out.println("Enter height (m): ");
		double height = input.nextDouble();
		
		System.out.println("Enter weight (kg): ");
		double weight = input.nextDouble();
		
		System.out.println("Enter waist (cm): ");
		double waist = input.nextDouble();
		
		System.out.println("Enter hip (cm): ");
		double hips = input.nextDouble();
		
		System.out.println("Enter bust (cm): ");
		double bust = input.nextDouble();
		
		Chick c = new Chick(height, weight, waist, hips, bust);
		
		c.calcGrade();
		System.out.println("Points: " + c.getPoints());
		
		input.close();
	}
	
}
