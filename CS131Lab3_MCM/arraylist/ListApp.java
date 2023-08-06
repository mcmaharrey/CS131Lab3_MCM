package arraylist;

public final class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> stringArray = new ArrayList<>(4);
		stringArray.addItem("Jim");
		stringArray.addItem("Sally");
		stringArray.addItem("David");
		stringArray.addItem("Kelsey");
		
		System.out.println(stringArray.toString());
		
		ArrayList<Square> squareArray = new ArrayList<>(5);
		squareArray.addItem(new Square(20.3));
		squareArray.addItem(new Square (40.2));
		squareArray.addItem(new Square (5.6));
		squareArray.addItem(new Square (8.0));
		squareArray.addItem(new Square (24.0));
		
		System.out.println(squareArray.toString());	
		
		ArrayList<PointThreeD> pointArray = new ArrayList<>(3);
		pointArray.addItem(new PointThreeD (2, 4, 6));
		pointArray.addItem(new PointThreeD (-3, -23, 4));
		pointArray.addItem(new PointThreeD (3, 6, 9));
		
		System.out.println(pointArray.toString());	
		
		
	}//end main

}//end class
