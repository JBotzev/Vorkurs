
public class Chick extends GValues {
	
	private double height;
	private double weight;
	private double waist;
	private double hips;
	private double bust;
	private byte points;
	
	public Chick() {
		
	}
	
	public Chick(double height, double weight, double waist, double hips, double bust) {
		
		this.height = height;
		this.weight = weight;
		this.waist = waist;
		this.hips = hips;
		this.bust = bust;
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
	
	public double getHips() {
		return hips;
	}
	
	public double getBust() {
		return bust;
	}
	
	public byte getPoints() {
		return points;
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
	
	public void calcHips() {
		
		if ( (hips <= getGHips() + 2) && (hips >= getGHips() - 3) ) {
			
			if( hips == getGHips() )
				points += 5;
			
			else if( (hips <= getGHips() + 1) && (hips >= getGHips() - 1) )
				points += 2;
			
			else
				points++;
		}
		else {
			points--;
		}
		
	}
	
	public void calcBust() {
		
if ( (bust <= getGBust() + 2) && (bust >= getGBust() - 3) ) {
			
			if( bust == getGBust() )
				points += 5;
			
			else if( (bust <= getGBust() + 1) && (bust >= getGBust() - 1) )
				points += 2;
			
			else
				points++;
		}
		else {
			points--;
		}
		
	}
	
	public void calcGrade() {
		
		calcWe();
		calcWa();
		calcHips();
		calcBust();
		
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
