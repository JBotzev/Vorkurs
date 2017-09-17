
public class GValues {
	
	//1) Waist Measurement=Height x 0.375
	//	 Wrap the tape at the narrowest point around the hips 
	//2) Bust Measurement=Waist Measurement x 1.5
	//	 Wrap the tape at the widest part around the chest
	//3) Hip Measurement: Same as Bust Measurement
	//	 Wrap the tape at the widest part around the buttocks. 
	//   For a woman that is 5 ft 4 in, this would imply the measurements of 36-24-36, i.e. 36 bust, 24=61cm waist and 36 =91cm hips.
	
	private double gHeight = 1.70;
	private double gWeight = 65;
	private double gWaist = gHeight * 0.375;
	private double gBoobs = 61;
	private byte gHip = gBoobs;
	
	//private double gHeight = 1.65;
	//private double gWeight = 50;
	//private double gWaist = 66;
	//private byte gASquish = 3;
	//private String gBoobs = "32c";
	
	public GValues() {
		
	}
	
	public GValues(double gHeight, double gWeight, double gWaist, byte gASquish, String gBoobs) {
		
		this.gHeight = gHeight;
		this.gWeight = gWeight;
		this.gWaist = gWaist;
		this.gASquish = gASquish;
		this.gBoobs = gBoobs;
		
	}
	
	public double getGHeight() {
		return gHeight;
	}
	
	public double getGWeight() {
		return gWeight;
	}
	
	public double getGWaist() {
		return gWaist;
	}
	
	public byte getGASquish() {
		return gASquish;
	}
	
	public String getGBoobs() {
		return gBoobs;
	}

}
