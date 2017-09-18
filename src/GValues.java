
public abstract class GValues{
	
	//1) Waist Measurement=Height x 0.375
	//	 Wrap the tape at the narrowest point around the hips 
	//2) Bust Measurement=Waist Measurement x 1.5
	//	 Wrap the tape at the widest part around the chest
	//3) Hip Measurement: Same as Bust Measurement
	//	 Wrap the tape at the widest part around the buttocks. 
	//   For a woman that is 5 ft 4 in, this would imply the measurements of 36-24-36, i.e. 36 bust, 24=61cm waist and 36 =91cm hips.
	
	Chick c = new Chick();
	
	private double gWeight = (c.getHeight() * 100) - 105;
	private double gWaist = c.getHeight() * 0.375;
	private double gBust = gWaist * 1.5;
	private double gHips = gBust;
	
	//height = 170 / weight = 65 / waist = 64 / bust = 96 / hips = 96
	
	
	//private double gHeight = 1.65;
	//private double gWeight = 50;
	//private double gWaist = 66;
	//private byte gASquish = 3;
	//private String gBoobs = "32c";
	
	public GValues() {
		
	}
	
	public GValues(double gWeight, double gWaist, double gHips, double gBust) {
		
		this.gWeight = gWeight;
		this.gWaist = gWaist;
		this.gHips = gHips;
		this.gBust = gBust;
		
	}
	
	public double getGWeight() {
		return gWeight;
	}
	
	public double getGWaist() {
		return gWaist;
	}
	
	public double getGHips() {
		return gHips;
	}
	
	public double getGBust() {
		return gBust;
	}

}
