import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner inputtext = new Scanner(System.in);
		
		System.out.println("Welcome to the Chick Meter !!!\n");
		
		System.out.println("Enter height (m): ");
		double height = input.nextDouble();
		
		System.out.println("Enter weight (kg): ");
		double weight = input.nextDouble();
		
		System.out.println("Enter waist (cm): ");
		double waist = input.nextDouble();
		
		System.out.println("Enter booty squishyness (0-5): ");
		byte aSquish = input.nextByte();
		
		System.out.println("Enter cup size: ");
		String boobs = inputtext.nextLine();
		
		Chick c = new Chick(height, weight, waist, aSquish, boobs);
		
		c.calcGrade();
		System.out.println("Points: " + c.getPoints());
		
		input.close();
		inputtext.close();
	}
	
}
