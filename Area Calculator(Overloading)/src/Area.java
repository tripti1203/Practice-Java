import java.io.*;
public class Area {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double radius = Double.parseDouble(br.readLine());
		double x = Double.parseDouble(br.readLine());
		double y = Double.parseDouble(br.readLine());
		System.out.println("Area of a circle......");
		System.out.println(area(radius));
		System.out.println("Area of rectangle.....");
		System.out.println(area(x,y));
	}
	public static double area(double r) {
		if(r<0) {
			return -1.0;
		}
		else {
		return 3.14*r*r;
		}
	}
	public static double area(double x , double y) {
		if(x<0 && y<0) {
			return -1.0;
		}
		else {
		return x*y;
		}
	}
}
