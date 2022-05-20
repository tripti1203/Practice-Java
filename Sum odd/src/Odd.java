import java.io.*;
public class Odd {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		int result = sumOdd(start,end);
		System.out.println(result);
	}
	public static boolean isOdd(int num) {
		if(num%2!=0) { 
			return true;
		}
		else {
			return false;
		}
	}
	public static int sumOdd(int start , int end ) {
		int i , sum=0;
		for(i=start;i<=end;i++) {
			if(isOdd(i)) {
				sum = sum+i;
			}
		}
		return sum;
	}
}
