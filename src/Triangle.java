

public class Triangle extends GeometricObject{
	public int side1, side2, side3;
	
	public Triangle(int side1, int side2, int side3, String color, boolean filled)
	{
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public int getPerimeter(){
		return side1 + side2 + side3;
	}
}
