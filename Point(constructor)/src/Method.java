
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point first = new Point(6,5);
		Point second = new Point(3,1);
		System.out.println("Distance at origin(0,0) = " + first.distance());
		System.out.println("Distance = " + first.distance(2,2));
		System.out.println("Distance second = " + first.distance(second));
	}

}
