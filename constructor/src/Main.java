public class Main {

    public static void main(String[] args) {
	Rectangle r1= new Rectangle(7,9);
	System.out.println("r1 height:"+r1.getHeight());
	System.out.println("r1 width:"+r1.getWidth());
	r1.Area();
	r1.perimeter();
	Rectangle r2= new Rectangle(8,9);
	System.out.println("r2 height:"+r2.getHeight());
	System.out.println("r2 width:"+r2.getWidth());
	r2.Area();
	r2.perimeter();

    }
}
