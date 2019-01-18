/*
 * Sam Valenzuela
 * 11-26-18
 * Turkey.java
 * Class containing methods to calculate turkey cooking instructions
 */

public class Turkey{
	private String sName;
	private double dWeight;
	private boolean bType;

	public Turkey(){
		sName = "";
		dWeight = 0;
		bType = false;
	}

	public Turkey(String nm, double wt, boolean tp){
		sName = nm;
		dWeight = wt;
		bType = tp;
	}

	public void setName(String nm){
		sName = nm;
	}

	public String getName(){
		return sName;
	}

	public void setWeight(double wt){
		dWeight = wt;
	}

	public double getWeight(){
		return dWeight;
	}

	public void setType(boolean tp){
		bType = tp;
	}

	public boolean getType(){
		return bType;
	}

	public int getHours(){
		int iHours;
		if(bType == true){
			iHours = 21 * (int)dWeight;
		}else{
			iHours = 18 * (int)dWeight;
		}
		iHours /= 60;
		return iHours;
	}

	public double getMin(){
		double iMin;
		if(bType == true){
			iMin = 21 * (double)dWeight;
		}else{
			iMin = 18 * (double)dWeight;
		}
		iMin %= 60;
		return iMin;
	}

	public double getTotalMin(){
		double iTotalMin;
		if(bType == true){
			iTotalMin = 21 * (dWeight);
		}else{
			iTotalMin = 18 * (dWeight);
		}
			return iTotalMin;
	}

	public String toString(){
		String str;

		str = 	"\nName: " + sName +
				"\nWeight: " + dWeight + " lbs" +
				"\nStuffed: " + bType +
				"\nCook time: " + getHours() + " hours and " + getMin() + " minutes (" + getTotalMin() + " total minutes).";
		return str;
	}
}