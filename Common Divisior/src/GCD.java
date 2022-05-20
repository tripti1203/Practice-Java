import java.io.*;
public class GCD {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		int result = getGreatestCommonDivisor(first,second);
		System.out.println(result);
	}
	public static int getGreatestCommonDivisor(int a , int b) {
		if(a<10 || b<10) {
			return -1;
		}
		else {
			while(a!=b) {
				if(a>b) {
					a = a-b;
				}
				else {
					b= b-a;
				}
			}
			return a;
		}
	}
}
