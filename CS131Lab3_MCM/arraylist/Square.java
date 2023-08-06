package arraylist;

public class Square {
	
	private double size;
	
	public Square() {
		
	}//end empty argument 
	
	public Square(double s) {
		this.size = s;
	}//end preferred 
	
	public double getArea() {
		double A = Math.pow(size,2);
		return A;
	}//end getArea

	@Override
	public String toString() {
		return "Square [size=" + size + " + area=" + String.format("%.2f", getArea()) +"]";
	}
	
	
	
	
}//end class
