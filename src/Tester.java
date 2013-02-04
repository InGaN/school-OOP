


public class Tester {
	
	private static GeometricObject shape;
	private static Parser parser;
	
	public static void main(String[] args) {
		System.out.println("Vul parameters in voor de Triangle shape:\n");
		
		parser = new Parser();	
		System.out.println("vul zijde 1 in");
		int side1 = parser.requestSide();
		System.out.println("vul zijde 2 in");
		int side2 = parser.requestSide();
		System.out.println("vul zijde 3 in");
		int side3 = parser.requestSide();
		System.out.println("vul de kleur in");
		String color = parser.requestColor();
		System.out.println("is de shape filled? (true / false)");
		boolean filled = parser.requestBoolean();
		
		shape = new Triangle(side1, side2, side3, color, filled);
		System.out.println("====================");
		System.out.println(shape.toString());
		System.out.println("Peri: "+shape.getPerimeter());
		System.out.println("Kleur: "+shape.getColor());
	}

}
