public class Chick {
	
	private double height;
	private double weight;
	private double waist;
	private double bust;
	private double hips;
	
	private byte points;
	private GValues gV = new GValues();
	
	public Chick(double height, double weight, double waist, double bust, double hips) {
		
		this.height = height;
		this.weight = weight;
		this.waist = waist;
		this.bust = bust;
		this.hips = hips;
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
	
	public double getBust() {
		return bust;
	}
	
	public double getHips() {
		return hips;
	}
	
	public byte getPoints() {
		return points;
	}
	
	public void calcH() {
		
		if (Math.abs(gV.getGHeight() - height) <= 0.10) {
			
			if (height == gV.getGHeight()) {
				points += 5;
			} else if (Math.abs(gV.getGHeight() - height) <= 0.2) {
				points += 4;
			} else if (Math.abs(gV.getGHeight() - height) <= 0.4) {
				points += 3;
			} else if (Math.abs(gV.getGHeight() - height) <= 0.6) {
				points += 2;
			} else {
				points++;
			}
			
		}
		
	}
	
	public void calcWe() {
		
		if (Math.abs(gV.getGWeight() - weight) <= 10) {
			
			if (weight == gV.getGWeight()) {
				points += 5;
			} else if (Math.abs(gV.getGWeight() - weight) <= 2) {
				points += 4;
			} else if (Math.abs(gV.getGWeight() - weight) <= 4) {
				points += 3;
			} else if (Math.abs(gV.getGWeight() - weight) <= 6) {
				points += 2;
			} else {
				points++;
			}
			
		}
		
	}
	
	public void calcWa() {
		
		if (Math.abs(gV.getGWaist() - waist) <= 10) {
			
			if (height == gV.getGWaist()) {
				points += 5;
			} else if (Math.abs(gV.getGWaist() - waist) <= 2) {
				points += 4;
			} else if (Math.abs(gV.getGWaist() - waist) <= 4) {
				points += 3;
			} else if (Math.abs(gV.getGWaist() - waist) <= 6) {
				points += 2;
			} else {
				points++;
			}
			
		}
		
	}
	
	public void calcBust() {
		
		if (Math.abs(gV.getGBust() - bust) <= 10) {
			
			if (height == gV.getGBust()) {
				points += 5;
			} else if (Math.abs(gV.getGBust() - bust) <= 2) {
				points += 4;
			} else if (Math.abs(gV.getGBust() - bust) <= 4) {
				points += 3;
			} else if (Math.abs(gV.getGBust() - bust) <= 6) {
				points += 2;
			} else {
				points++;
			}
			
		}
		
	}
	
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
	
	public void calcGrade() {
		
		calcH();
		calcWe();
		calcWa();
		calcBust();
		calcHips();
		
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