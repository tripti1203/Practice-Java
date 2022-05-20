import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = sumFirstAndLast(n);
		System.out.println(result);
	}
	public static int sumFirstAndLast(int num) {
		int r=0, sum=0;
		if(num<0) {
			return -1;
		}
		else {
			while(num>10) {
			num = num/10;
			}
			r=num%10;
			sum= num+r;
			return sum;
		}
	}
}
