import java.io.*;
public class Method {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Method Overloading.......");
		System.out.print("Enter first input : ");
		int a = Integer.parseInt(reader.readLine());
		System.out.print("Enter second input : ");
		int b = Integer.parseInt(reader.readLine());
		System.out.print("Enter third input : ");
		int c = Integer.parseInt(reader.readLine());
		System.out.print("Enter fourth input : ");
		int d = Integer.parseInt(reader.readLine());
		int newSum1 = sum(a,b);
		int newSum2 = sum(a,b,c);
		int newSum3 = sum(a,b,c,d);
		System.out.println("First sum : " + newSum1 + "\nOverloaded sum : " + newSum2 + "\nAgain overloaded sum : " + newSum3);
	}
	public static int sum(int a , int b) {
		return a+b;
	}
	public static int sum(int a, int b , int c) {
		
		return a+b+c;
	}
	public static int sum(int a , int b, int c, int d) {
		return a+b+c+d;
	}
}
