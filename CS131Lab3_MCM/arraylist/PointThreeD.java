package arraylist;

public class PointThreeD {
	
	private double xPoint, yPoint, zPoint;
	
	public PointThreeD() {
		
	}//empty argument 
	
	public PointThreeD(double x, double y, double z) {
		this.xPoint = x;
		this.yPoint = y;
		this.zPoint = z;
		
	}//end preferred

	public double getxPoint() {
		return xPoint;
	}

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}

	public double getyPoint() {
		return yPoint;
	}

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}

	public double getzPoint() {
		return zPoint;
	}

	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}
	
	
	
	
}//end class
