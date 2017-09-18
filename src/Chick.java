
public class Chick {
	
	private double height;
	private double weight;
	private double waist;
<<<<<<< HEAD
	private double bust;
	private double hips;
	
=======
	private double hips;
	private double bust;
>>>>>>> origin/master
	private byte points;
	private GValues gV = new GValues();
	
<<<<<<< HEAD
	public Chick(double height, double weight, double waist, double bust, double hips) {
=======
	public Chick() {
		
	}
	
	public Chick(double height, double weight, double waist, double hips, double bust) {
>>>>>>> origin/master
		
		this.height = height;
		this.weight = weight;
		this.waist = waist;
<<<<<<< HEAD
		this.bust = bust;
		this.hips = hips;
=======
		this.hips = hips;
		this.bust = bust;
>>>>>>> origin/master
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
	
<<<<<<< HEAD
	public double getBust() {
		return bust;
	}
	
	public double getHips() {
		return hips;
=======
	public double getHips() {
		return hips;
	}
	
	public double getBust() {
		return bust;
>>>>>>> origin/master
	}
	
	public byte getPoints() {
		return points;
	}
	
	public void calcWe() {
		
<<<<<<< HEAD
		if (Math.abs(gV.getGHeight() - height) <= 0.10) {
			
			if (height == gV.getGHeight()) {
				points += 5;
			} else if (Math.abs(gV.getGHeight() - height) <= 0.2) {
				points += 4;
			} else if (Math.abs(gV.getGHeight() - height) <= 0.4) {
				points += 3;
			} else if (Math.abs(gV.getGHeight() - height) <= 0.6) {
=======
		if ( (weight <= getGWeight() + 10) && (weight >= getGWeight() - 10) ) {
			
			if( weight == getGWeight() )
				points += 5;
			
			else if( (weight <= getGWeight() + 5) && (weight >= getGWeight() - 5) )
>>>>>>> origin/master
				points += 2;
			} else {
				points++;
			}
			
		}
		
	}
	
	public void calcWa() {
		
<<<<<<< HEAD
		if (Math.abs(gV.getGWeight() - weight) <= 10) {
			
			if (weight == gV.getGWeight()) {
				points += 5;
			} else if (Math.abs(gV.getGWeight() - weight) <= 2) {
				points += 4;
			} else if (Math.abs(gV.getGWeight() - weight) <= 4) {
				points += 3;
			} else if (Math.abs(gV.getGWeight() - weight) <= 6) {
=======
		if ( (waist <= getGWaist() + 5) && (waist >= getGWaist() - 5) ) {
			
			if( waist == getGWaist() )
				points += 5;
			
			else if( (waist <= getGWaist() + 2) && (waist >= getGWaist() - 2) )
>>>>>>> origin/master
				points += 2;
			} else {
				points++;
			}
			
		}
		
	}
	
	public void calcHips() {
		
<<<<<<< HEAD
		if (Math.abs(gV.getGWaist() - waist) <= 10) {
			
			if (height == gV.getGWaist()) {
				points += 5;
			} else if (Math.abs(gV.getGWaist() - waist) <= 2) {
				points += 4;
			} else if (Math.abs(gV.getGWaist() - waist) <= 4) {
				points += 3;
			} else if (Math.abs(gV.getGWaist() - waist) <= 6) {
=======
		if ( (hips <= getGHips() + 2) && (hips >= getGHips() - 3) ) {
			
			if( hips == getGHips() )
				points += 5;
			
			else if( (hips <= getGHips() + 1) && (hips >= getGHips() - 1) )
>>>>>>> origin/master
				points += 2;
			} else {
				points++;
			}
			
		}
		
	}
	
	public void calcBust() {
		
<<<<<<< HEAD
		if (Math.abs(gV.getGBust() - bust) <= 10) {
			
			if (height == gV.getGBust()) {
				points += 5;
			} else if (Math.abs(gV.getGBust() - bust) <= 2) {
				points += 4;
			} else if (Math.abs(gV.getGBust() - bust) <= 4) {
				points += 3;
			} else if (Math.abs(gV.getGBust() - bust) <= 6) {
=======
if ( (bust <= getGBust() + 2) && (bust >= getGBust() - 3) ) {
			
			if( bust == getGBust() )
				points += 5;
			
			else if( (bust <= getGBust() + 1) && (bust >= getGBust() - 1) )
>>>>>>> origin/master
				points += 2;
			} else {
				points++;
			}
			
		}
		
	}
	
<<<<<<< HEAD
	public void calcHips() {
		
		if (Math.abs(gV.getGHips() - hips) <= 10) {
			
			if (height == gV.getGHips()) {
				points += 5;
			} else if (Math.abs(gV.getGHips() - hips) <= 2) {
				points += 4;
			} else if (Math.abs(gV.getGHips() - hips) <= 4) {
				points += 3;
			} else if (Math.abs(gV.getGHips() - hips) <= 6) {
				points += 2;
			} else {
				points++;
			}
			
		}
		
	}
	
=======
>>>>>>> origin/master
	public void calcGrade() {
		
		calcWe();
		calcWa();
<<<<<<< HEAD
		calcBust();
		calcHips();
=======
		calcHips();
		calcBust();
>>>>>>> origin/master
		
		if (points >= 21) {
			System.out.println("Score: A");
		}
		
		else if ((points >= 17) && (points < 21)) {
			System.out.println("Score: B");
		}
		
		else if ((points >= 13) && (points < 17)) {
			System.out.println("Score: C");
		}
		
		else if ((points >= 9) && (points < 13)) {
			System.out.println("Score: D");
		}
		
		else if ((points >= 5) && (points < 9)) {
			System.out.println("Score: E");
		}
		
		else if (points < 5) {
			System.out.println("Score: F");
		}
	}


}
