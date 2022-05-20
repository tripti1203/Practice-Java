
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wall wall1 = new Wall(5,4);
		System.out.println("<------------------First----------------------->");
		System.out.println("Area = " + wall1.getArea());
		System.out.println("Height = " + wall1.getHeight());
		System.out.println("Width = " + wall1.getWidth());
		
		Wall wall2 = new Wall(-2,-5);
		System.out.println("<-----------Second----------->");
		System.out.println("Area = " + wall2.getArea());
		System.out.println("Height = " + wall2.getHeight());
		System.out.println("Width = " + wall2.getWidth());
		
		Wall wall3 = new Wall(-2,5);
		System.out.println("<---------Third--------->");
		System.out.println("Area = " + wall3.getArea());
		System.out.println("Height = " + wall3.getHeight());
		System.out.println("Width = " + wall3.getWidth());
	}

}
