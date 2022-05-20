
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(3.75);
		System.out.println("Radius = " + circle.getRadius());
		System.out.println("Area = " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55,7.25);
		System.out.println("Height = " + cylinder.getHeight());
		System.out.println("Volume = " + cylinder.getVolume());
		System.out.println("Area of Cylinder = " + cylinder.getArea());
	}

}
