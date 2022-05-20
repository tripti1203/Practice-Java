import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		printEqual(a,b,c);
	}
	public static void printEqual(int a , int b , int c) {
		if(a<0 || b<0 || c<0) {
			System.out.println("INVALID VALUE.....");
		}
		else if (a==b || b==c || c==a) {
			System.out.println("All numbers are equal...");
		}
		else {
			System.out.println("All numbers are different....");
		}
	}
}
