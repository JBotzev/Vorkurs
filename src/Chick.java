
public class Chick extends GValues {
	
	private double height;
	private double weight;
	private double waist;
	private byte aSquish;
	private String boobs;
	private byte points;
	
	public Chick(double height, double weight, double waist, byte aSquish, String boobs) {
		
		this.height = height;
		this.weight = weight;
		this.waist = waist;
		this.aSquish = aSquish;
		this.boobs = boobs;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getWaist() {
		return waist;
	}
	
	public byte getASquish() {
		return aSquish;
	}
	
	public String getBoobs() {
		return boobs;
	}
	
	public byte getPoints() {
		return points;
	}
	
	public void calcH() {
		
		if ( (height <= getGHeight() + 0.05) && (height >= getGHeight() - 0.05) ) {
			
			if( height == getGHeight() )
				points += 5;
			
			else if( (height <= getGHeight() + 0.02) && (height >= getGHeight() - 0.02) )
				points += 2;
			
			else
				points++;
		}
		else {
			points--;
		}
		
	}
	
	public void calcWe() {
		
		if ( (weight <= getGWeight() + 10) && (weight >= getGWeight() - 10) ) {
			
			if( weight == getGWeight() )
				points += 5;
			
			else if( (weight <= getGWeight() + 5) && (weight >= getGWeight() - 5) )
				points += 2;
			
			else
				points++;
		}
		else {
			points--;
		}
		
	}
	
	public void calcWa() {
		
		if ( (waist <= getGWaist() + 5) && (waist >= getGWaist() - 5) ) {
			
			if( waist == getGWaist() )
				points += 5;
			
			else if( (waist <= getGWaist() + 2) && (waist >= getGWaist() - 2) )
				points += 2;
			
			else
				points++;
		}
		else {
			points--;
		}
		
	}
	
	public void calcASquish() {
		
		if ( (aSquish <= getGASquish() + 2) && (aSquish >= getGASquish() - 3) ) {
			
			if( aSquish == getGASquish() )
				points += 5;
			
			else if( (aSquish <= getGASquish() + 1) && (aSquish >= getGASquish() - 1) )
				points += 2;
			
			else
				points++;
		}
		else {
			points--;
		}
		
	}
	
	public void calcBoobs() {
		
		if (boobs.equals("32c")) {
			points += 5;
		}
		else if (boobs.equals("32d")) {
			points += 2;
		}
		else if (boobs.equals("32e")) {
			points += 1;
		}
		else {
			points -= 1;
		}
	}
	
	public void calcGrade() {
		
		calcH();
		calcWe();
		calcWa();
		calcASquish();
		calcBoobs();
		
		if (points >= 20) {
			System.out.println("Score: A");
		}
		
		else if ( (points >= 15) && (points < 20) ) {
			System.out.println("Score: B");
		}
		
		else if ( (points >= 10) && (points < 15) ) {
			System.out.println("Score: C");
		}
		
		else if ( (points >= 5) && (points < 10) ) {
			System.out.println("Score: D");
		}
		
		else if ( (points >= 0) && (points < 5) ) {
			System.out.println("Score: E");
		}
		
		else {
			System.out.println("Score: F");
		}
	}


}
