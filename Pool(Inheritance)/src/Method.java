
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(5,10);
		System.out.println("Width = " + rect.getWidth());
		System.out.println("Length = " + rect.getLength());
		System.out.println("Area = " + rect.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("Height = " + cuboid.getHeight());
		System.out.println("Volume = " + cuboid.getVolume());
		System.out.println("Arae of cuboid = " + cuboid.getArea());
	}

}
