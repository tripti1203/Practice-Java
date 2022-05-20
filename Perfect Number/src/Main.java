import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(isPerfect(num));
	}
	public static boolean isPerfect(int n) {
		int sum=0;
		if(n<1) {
			return false;
		}
		else {
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum = sum+i;
				}
			}
			if(sum==n) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
