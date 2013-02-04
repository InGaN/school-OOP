

public abstract class GeometricObject {
	public String color;
	public boolean isFilled;
	
	public GeometricObject(String color, boolean filled)
	{
		this.color = color;
		this.isFilled = filled;
	}
	
	public abstract int getPerimeter();
	public String getColor()
	{
		return color;
	}
	public boolean getFilled()
	{
		return isFilled;
	}
}
