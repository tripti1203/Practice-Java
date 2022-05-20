import java.util.*;
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i=1, fact=1 , r=0 , sum=0 ;
		int temp = num;
		while(temp>0) {
			r = r%10;
			for(i=1;i<r;i++) {
				fact = fact*i;
			}
			sum = sum+fact;
			temp = temp/10;
		}
		if(sum==num) {
			System.out.println( num + "Is a strong number");
		}
		else {
			System.out.println(num + " is not a strong number");
		}
	}
}