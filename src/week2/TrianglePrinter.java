package week2;
// test class
public class TrianglePrinter {
	static int side1;
	static int side2;
	static int side3;
	
	public TrianglePrinter(int side1, int side2, int side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public static int Perimeter()
	{
		return side1 + side2 + side3;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Perimeter is: " + Perimeter() + "cm");
	}
}
