package DemoPackage;

public class Rectangle {
	
	private int length = 12;
	private int breadth = 11;
	
	void calculatePerimeter(){
		int perimeter;
		perimeter = 2*(length+breadth);
		System.out.println("Perimeter is " + perimeter);
		//return perimeter;
		
	}
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.calculatePerimeter();
	}

}
