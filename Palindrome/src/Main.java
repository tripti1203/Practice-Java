import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		boolean result = isPalindrome(num);
		System.out.println(result);
	}
	public static boolean isPalindrome(int num) {
		int r=0 , sum=0 , temp=num;
		while(temp>0) {
			r= temp%10;
			sum= (sum*10)+r;
			temp=temp/10;
		}
		if(num==sum) {
			return true;
		}
		else {
			return false;
		}
	}
}
