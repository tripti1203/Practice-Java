import java.io.*;
public class Even {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Start = Integer.parseInt(br.readLine());
		int End = Integer.parseInt(br.readLine());
		int result = sumEven(Start,End);
		System.out.println(result);
	}
	public static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int sumEven(int start , int end) {
		int i,sum=0;
		for(i=start;i<=end;i++) {
		   if(isEven(i))
			sum= sum+i;
		}
		return sum;
	}
}
